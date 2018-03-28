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
package com.qyh.myblog_android.ui.activity.blog;

import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.qyh.myblog_android.R;
import com.qyh.myblog_android.app.Constants;
import com.qyh.myblog_android.base.SimpleActivity;
import com.qyh.myblog_android.model.bean.BlogDataBean;
import com.qyh.myblog_android.widget.AutoTypeTextView;

import butterknife.BindView;

/**
 * 类  名： BlogDetailActivity
 * 描  述：博客详情，后期打算改成html页面
 * 创建人： qyh
 * 日  期： 2018年03月24日 15:38
 * 版本号： 1.0
 * <p>
 * Copyright (c) 2018 www.youkb.net Inc. All rights reserved
 */


public class BlogDetailActivity extends SimpleActivity {

    @BindView(R.id.tool_bar)
    Toolbar toolBar;
    @BindView(R.id.tv_blogdetail_content)
    AutoTypeTextView tvBlogdetailContent;
    private BlogDataBean mData;

    @Override
    protected int getLayout() {
        return R.layout.activity_blogdetail;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initEventAndData() {
        mData = (BlogDataBean) getIntent().getSerializableExtra(Constants.BLOGCONTENT_TYPE);
        if (mData != null) {
            setToolBar(toolBar, mData.getTitle());
            tvBlogdetailContent.setText(mData.getContent());
        }
    }
}