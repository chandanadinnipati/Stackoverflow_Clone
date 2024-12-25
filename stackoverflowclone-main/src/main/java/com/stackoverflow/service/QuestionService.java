package com.stackoverflow.service;

import com.stackoverflow.dto.QuestionRequestDTO;
import com.stackoverflow.model.Question;

import java.util.List;

public interface QuestionService {
    Question createQuestion(QuestionRequestDTO questionRequestDTO);
    Question getQuestionById(Long id);
    List<Question> getAllQuestions();
    void updateQuestion(Long id, Question question);
    void updateQuestionWithDTO(Long id, QuestionRequestDTO questionRequestDTO);
    void deleteQuestion(Long id);
    void upvoteQuestion(Long id);
    void downvoteQuestion(Long id);
    void acceptAnswer(Long questionId,Long answerId);
    List<Question> getAllQuestionsSortedByLatest();
    List<Question> getAllQuestionsSortedByOldest();
    List<Question> searchQuestionsByTitle(String keyword);
}