package com.dzonesoft.exam.repository;

import com.dzonesoft.exam.domain.other.KeyValue;
import com.dzonesoft.exam.domain.Question;
import com.dzonesoft.exam.viewmodel.admin.question.QuestionPageRequestVM;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface QuestionMapper extends BaseMapper<Question> {
    int deleteByPrimaryKey(Integer id);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);

    List<Question> page(QuestionPageRequestVM requestVM);

    List<Question> selectByIds(@Param("ids") List<Integer> ids);

    Integer selectAllCount();

    List<KeyValue> selectCountByDate(@Param("startTime") Date startTime,@Param("endTime") Date endTime);
}
