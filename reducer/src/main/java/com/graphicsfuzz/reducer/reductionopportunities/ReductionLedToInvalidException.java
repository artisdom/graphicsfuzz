/*
 * Copyright 2018 The GraphicsFuzz Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.graphicsfuzz.reducer.reductionopportunities;

import com.graphicsfuzz.common.ast.TranslationUnit;
import com.graphicsfuzz.common.util.ExecResult;

public class ReductionLedToInvalidException extends RuntimeException {

  private final TranslationUnit tuBefore;
  private final TranslationUnit tuAfter;
  private final ExecResult execResult;
  private final IReductionOpportunity reductionOpportunity;

  public ReductionLedToInvalidException(TranslationUnit tuBefore, TranslationUnit tuAfter,
        ExecResult execResult, IReductionOpportunity reductionOpportunity) {
    this.tuBefore = tuBefore;
    this.tuAfter = tuAfter;
    this.execResult = execResult;
    this.reductionOpportunity = reductionOpportunity;
  }

  public TranslationUnit getTuBefore() {
    return tuBefore;
  }

  public TranslationUnit getTuAfter() {
    return tuAfter;
  }

  public ExecResult getExecResult() {
    return execResult;
  }

  public IReductionOpportunity getReductionOpportunity() {
    return reductionOpportunity;
  }

}
