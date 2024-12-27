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

import java.util.HashMap;
import java.util.Map;
import org.kie.kogito.MapOutput;
import org.kie.kogito.UserTask;

@UserTask(taskName = "Task", processName = "approval")
public class Approval__136481F4_8785_4EF1_9BEA_65E525118299_TaskOutput implements MapOutput {

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap<>();
        return params;
    }

    public static Approval__136481F4_8785_4EF1_9BEA_65E525118299_TaskOutput fromMap(Map<String, Object> params) {
        com.example.Approval__136481F4_8785_4EF1_9BEA_65E525118299_TaskOutput result = new Approval__136481F4_8785_4EF1_9BEA_65E525118299_TaskOutput();
        return result;
    }
}
//Task output for user task 'Review Application' in process 'approval'
