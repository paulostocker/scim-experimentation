/** Copyright © 2016, Okta, Inc.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.okta.scim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.okta.scim.Database;
import com.okta.scim.model.ListResponse;

import java.util.Map;

/**
 *  URL route example.com/scim/v2/Groups
 */


@Controller
@RequestMapping("/scim/v2/Groups")
public class GroupsController {
    Database db;

    @Autowired
    public GroupsController(Database db) {
        this.db = db;
    }
    /**
     *  Returns default {@link ListResponse} object
     *
     *  @return JSON {@link Map} {@link ListResponse}
     */
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Map groupsGet() {
        ListResponse groups = new ListResponse();
        return groups.toScimResource();
    }
}
