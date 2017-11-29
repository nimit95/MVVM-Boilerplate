/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.nimit.wakatime.data.remote;



import com.nimit.wakatime.data.model.api.BlogResponse;
import com.nimit.wakatime.data.model.api.LoginRequest;
import com.nimit.wakatime.data.model.api.LoginResponse;
import com.nimit.wakatime.data.model.api.LogoutResponse;
import com.nimit.wakatime.data.model.api.OpenSourceResponse;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by amitshekhar on 07/07/17.
 */

@Singleton
public class AppApiHelper implements ApiHelper {

    private ApiHeader mApiHeader;

    @Inject
    public AppApiHelper(ApiHeader apiHeader) {
        mApiHeader = apiHeader;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHeader;
    }


    // demo methods to fill
/*
    @Override
    public Observable<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest
                                                                  request) {

    }

    @Override
    public Observable<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest
                                                                    request) {

    }

    @Override
    public Observable<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest
                                                                  request) {

    }

    @Override
    public Observable<LogoutResponse> doLogoutApiCall() {

    }

    @Override
    public Observable<BlogResponse> getBlogApiCall() {

    }

    @Override
    public Observable<OpenSourceResponse> getOpenSourceApiCall() {

    }*/
}
