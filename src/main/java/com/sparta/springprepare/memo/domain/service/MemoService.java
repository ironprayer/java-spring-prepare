package com.sparta.springprepare.memo.domain.service;

import com.sparta.springprepare.memo.domain.dto.MemoRequestDto;
import com.sparta.springprepare.memo.domain.dto.MemoResponseDto;
import com.sparta.springprepare.memo.domain.entity.Memo;
import com.sparta.springprepare.memo.domain.repository.MemoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoService {

    private final MemoRepository memoRepository;

    public MemoService(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }


    public MemoResponseDto createMemo(MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);

        Memo saveMemo = memoRepository.save(memo);

        MemoResponseDto memoResponseDto = new MemoResponseDto(saveMemo);

        return memoResponseDto;
    }

    public List<MemoResponseDto> getMemos() {

        return memoRepository.findAllByOrderByModifiedAtDesc()
                .stream().map(MemoResponseDto::new).toList();

    }

    @Transactional
    public Long updateMemo(Long id, MemoRequestDto requestDto) {

        Memo memo = findMemo(id);

        memo.update(requestDto);
        return id;
    }

    public Long deleteMemo(Long id) {

        Memo memo = findMemo(id);

        memoRepository.delete(memo);

        return id;

    }

    private Memo findMemo(Long id) {
        return memoRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("선택한 메모는 존재하지 않습니다.")
        );
    }
}
