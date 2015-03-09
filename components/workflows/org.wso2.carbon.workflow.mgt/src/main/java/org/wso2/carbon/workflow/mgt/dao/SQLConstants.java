/*
 * Copyright (c) 2015 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.workflow.mgt.dao;

/**
 * Holds the SQL queries and constants
 */
public class SQLConstants {

    public static final String REQUEST_COLUMN = "REQUEST";


    public static final String ADD_WORKFLOW_REQUEST_QUERY = "INSERT INTO WF_REQUESTS(UUID, CREATED_AT, UPDATED_AT, " +
            "REQUEST, STATUS) VALUES (?, ?, ?, ?, ?)";

    public static final String GET_WORKFLOW_REQUEST_QUERY = "SELECT UUID, REQUEST, STATUS FROM WF_REQUESTS WHERE UUID" +
            " = ?";
    private SQLConstants(){
    }
}