package com.cyc.query;

/*
 * #%L
 * File: ParaphrasedQueryAnswer.java
 * Project: Core API
 * %%
 * Copyright (C) 2015 - 2019 Cycorp, Inc
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
import com.cyc.kb.Variable;
import com.cyc.nl.Paraphrase;
import com.cyc.nl.Paraphraser;
import java.util.Map;

/**
 *
 * @author daves
 */
public interface ParaphrasedQueryAnswer extends QueryAnswer {

  public Paraphraser getParaphraser();

  public Paraphrase getBindingParaphrase(Variable var);

  public Map<Variable, Paraphrase> getParaphrasedBindings();

}
