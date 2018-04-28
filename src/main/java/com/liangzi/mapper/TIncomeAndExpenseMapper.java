package com.liangzi.mapper;

import com.liangzi.pojo.TIncomeAndExpense;
import com.liangzi.pojo.TIncomeAndExpenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TIncomeAndExpenseMapper {
    long countByExample(TIncomeAndExpenseExample example);

    int deleteByExample(TIncomeAndExpenseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TIncomeAndExpense record);

    int insertSelective(TIncomeAndExpense record);

    List<TIncomeAndExpense> selectByExample(TIncomeAndExpenseExample example);

    TIncomeAndExpense selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TIncomeAndExpense record, @Param("example") TIncomeAndExpenseExample example);

    int updateByExample(@Param("record") TIncomeAndExpense record, @Param("example") TIncomeAndExpenseExample example);

    int updateByPrimaryKeySelective(TIncomeAndExpense record);

    int updateByPrimaryKey(TIncomeAndExpense record);
}