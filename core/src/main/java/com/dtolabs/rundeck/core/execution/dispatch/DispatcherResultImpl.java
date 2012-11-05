/*
 * Copyright 2012 DTO Labs, Inc. (http://dtolabs.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

/*
* DispatcherResultImpl.java
* 
* User: Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
* Created: 11/2/12 12:11 PM
* 
*/
package com.dtolabs.rundeck.core.execution.dispatch;

import com.dtolabs.rundeck.core.execution.StatusResult;

import java.util.*;


/**
 * DispatcherResultImpl is ...
 *
 * @author Greg Schueler <a href="mailto:greg@dtosolutions.com">greg@dtosolutions.com</a>
 */
public class DispatcherResultImpl implements DispatcherResult, HasDispatcherResult {
    private Map<String, ? extends StatusResult> results;
    private boolean success;
    private String description;

    public DispatcherResultImpl(Map<String, ? extends StatusResult> results, boolean success) {
        this.results = results;
        this.success = success;
    }

    public DispatcherResultImpl(Map<String, ? extends StatusResult> results, boolean success, String description) {
        this.results = results;
        this.success = success;
        this.description = description;
    }

    public Map<String, ? extends StatusResult> getResults() {
        return results;
    }

    public void setResults(Map<String, ? extends StatusResult> results) {
        this.results = results;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public DispatcherResult getDispatcherResult() {
        return this;
    }

    @Override
    public String toString() {
        if(null!=description){
            return description;
        }
        return "DispatcherResultImpl{" +
               "results=" + results +
               ", success=" + success +
               ", description='" + description + '\'' +
               '}';
    }
}
