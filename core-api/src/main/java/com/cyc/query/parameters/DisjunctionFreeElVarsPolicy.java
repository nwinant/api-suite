package com.cyc.query.parameters;

/*
 * #%L
 * File: DisjunctionFreeElVarsPolicy.java
 * Project: Core API
 * %%
 * Copyright (C) 2015 - 2018 Cycorp, Inc
 * %%
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
 * #L%
 */

/**
 *
 * @author baxter
 */
public enum DisjunctionFreeElVarsPolicy implements InferenceParameterValue {

  /**
   * Compute the intersection of EL variables in disjuncts. *
   */
  COMPUTE_INTERSECTION,
  /**
   * Compute the union of EL variables in disjuncts. *
   */
  COMPUTE_UNION,
  /**
   * Each disjunct must have the exact same set of EL variables.
   */
  REQUIRE_EQUAL;

  @Override
  public String toString() {
    return ":" + name().replace("_", "-");
  }
}
