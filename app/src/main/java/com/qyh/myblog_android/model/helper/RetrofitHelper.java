/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.qyh.myblog_android.model.helper;


import com.qyh.myblog_android.model.api.MyApis;
import com.qyh.myblog_android.model.bean.BlogDataBean;
import com.qyh.myblog_android.model.bean.BlogDetailBean;
import com.qyh.myblog_android.model.bean.BlogTypeBean;
import com.qyh.myblog_android.model.bean.MyHttpResponse;
import com.qyh.myblog_android.model.bean.UserInfoBean;
import com.qyh.myblog_android.model.bean.VideoDataBean;
import com.qyh.myblog_android.model.bean.VideoTypeBean;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * 类  名： RetrofitHelper
 * 描  述：
 * 创建人： qyh
 * 日  期： 2018年03月17日 22:41
 * 版本号： 1.0
 * <p>
 * Copyright (c) 2018 www.g7.com.cn Inc. All rights reserved
 */
public class RetrofitHelper implements HttpHelper {

    private MyApis myApis;

    @Inject
    public RetrofitHelper(MyApis apis) {
        this.myApis = apis;
    }

    @Override
    public Flowable<MyHttpResponse> regist(String phone, String password, String userName) {
        return myApis.regist(phone, password, userName);
    }

    @Override
    public Flowable<UserInfoBean> login(String phone, String password) {
        return myApis.login(phone, password);
    }

    @Override
    public Flowable<UserInfoBean> getUserInfo(String userId) {
        return myApis.getUserInfo(userId);
    }

    @Override
    public Flowable<MyHttpResponse<List<BlogTypeBean>>> getBlogTypeList() {
        return myApis.getBlogType();
    }

    @Override
    public Flowable<MyHttpResponse<List<BlogDataBean>>> getBlogList(int type, int page, int pageSize) {
        return myApis.getBlogList(type, page, pageSize);
    }

    @Override
    public Flowable<MyHttpResponse<List<BlogDataBean>>> getBlogListByid(String userId) {
        return myApis.getBlogListByUserid(userId);
    }

    @Override
    public Flowable<MyHttpResponse> addBlog(Map map) {
        return myApis.addBlog(map);
    }

    @Override
    public Flowable<MyHttpResponse<BlogDetailBean>> getBlogDetail(int id) {
        return myApis.getBlogDetail(id);
    }

    @Override
    public Flowable<MyHttpResponse<List<VideoTypeBean>>> getVideoTypeList() {
        return myApis.getVideoTypeList();
    }

    @Override
    public Flowable<MyHttpResponse<List<VideoDataBean>>> getVideoDataList(int page, int pageSize) {
        return myApis.getVideoDataList(page, pageSize);
    }
}