package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RukuxinxiEntity;
import com.entity.view.RukuxinxiView;

import com.service.RukuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 入库信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-27 17:29:35
 */
@RestController
@RequestMapping("/rukuxinxi")
public class RukuxinxiController {
    @Autowired
    private RukuxinxiService rukuxinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RukuxinxiEntity rukuxinxi,
		HttpServletRequest request){
        EntityWrapper<RukuxinxiEntity> ew = new EntityWrapper<RukuxinxiEntity>();

		PageUtils page = rukuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rukuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RukuxinxiEntity rukuxinxi, 
		HttpServletRequest request){
        EntityWrapper<RukuxinxiEntity> ew = new EntityWrapper<RukuxinxiEntity>();

		PageUtils page = rukuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rukuxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RukuxinxiEntity rukuxinxi){
       	EntityWrapper<RukuxinxiEntity> ew = new EntityWrapper<RukuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( rukuxinxi, "rukuxinxi")); 
        return R.ok().put("data", rukuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RukuxinxiEntity rukuxinxi){
        EntityWrapper< RukuxinxiEntity> ew = new EntityWrapper< RukuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( rukuxinxi, "rukuxinxi")); 
		RukuxinxiView rukuxinxiView =  rukuxinxiService.selectView(ew);
		return R.ok("查询入库信息成功").put("data", rukuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RukuxinxiEntity rukuxinxi = rukuxinxiService.selectById(id);
        return R.ok().put("data", rukuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RukuxinxiEntity rukuxinxi = rukuxinxiService.selectById(id);
        return R.ok().put("data", rukuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RukuxinxiEntity rukuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(rukuxinxi);
        rukuxinxiService.insert(rukuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RukuxinxiEntity rukuxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(rukuxinxi);
        rukuxinxiService.insert(rukuxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RukuxinxiEntity rukuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(rukuxinxi);
        rukuxinxiService.updateById(rukuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        rukuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
