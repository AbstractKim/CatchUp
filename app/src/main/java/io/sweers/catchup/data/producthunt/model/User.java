/*
 * Copyright 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.sweers.catchup.data.producthunt.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.Map;

/**
 * Models a user on Product Hunt.
 */
@AutoValue
public abstract class User {

  public static JsonAdapter<User> jsonAdapter(@NonNull Moshi moshi) {
    return new AutoValue_User.MoshiJsonAdapter(moshi);
  }

  public abstract String created_at();

  @Nullable public abstract String headline();

  public abstract long id();

  public abstract Map<String, String> image_url();

  public abstract String name();

  public abstract String profile_url();

  public abstract String username();

  @Nullable public abstract String website_url();
}