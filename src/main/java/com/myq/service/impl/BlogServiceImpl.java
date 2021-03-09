package com.myq.service.impl;

import com.myq.entity.Blog;
import com.myq.mapper.BlogMapper;
import com.myq.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 孟赟强
 * @since 2021-01-12
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
