package com.dao;

import com.entity.TechanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TechanxinxiVO;
import com.entity.view.TechanxinxiView;


/**
 * 特产信息
 * 
 * @author 
 * @email 
 * @date 2023-02-24 12:59:57
 */
public interface TechanxinxiDao extends BaseMapper<TechanxinxiEntity> {
	
	List<TechanxinxiVO> selectListVO(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
	
	TechanxinxiVO selectVO(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
	
	List<TechanxinxiView> selectListView(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);

	List<TechanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
	
	TechanxinxiView selectView(@Param("ew") Wrapper<TechanxinxiEntity> wrapper);
	

}
