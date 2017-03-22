/* Copyright 2016 Google Inc
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
package com.google.api.codegen.viewmodel;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BatchingPartitionKeyView {

  public abstract String separatorLiteral();

  public abstract String fieldGetFunction();

  public static Builder newBuilder() {
    return new AutoValue_BatchingPartitionKeyView.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder separatorLiteral(String val);

    public abstract Builder fieldGetFunction(String val);

    public abstract BatchingPartitionKeyView build();
  }
}
