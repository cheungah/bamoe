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
package com.example;

import java.util.Map;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "Task", processName = "approval")
public class Approval__136481F4_8785_4EF1_9BEA_65E525118299_TaskInput {

    public static Approval__136481F4_8785_4EF1_9BEA_65E525118299_TaskInput fromMap(Map<String, Object> params) {
        Approval__136481F4_8785_4EF1_9BEA_65E525118299_TaskInput item = new Approval__136481F4_8785_4EF1_9BEA_65E525118299_TaskInput();
        item.applicant = (org.acme.cc_approval.model.Applicant) params.get("applicant");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.acme.cc_approval.model.Applicant applicant;

    public org.acme.cc_approval.model.Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(org.acme.cc_approval.model.Applicant applicant) {
        this.applicant = applicant;
    }
}
//Task input for user task 'Review Application' in process 'approval'
