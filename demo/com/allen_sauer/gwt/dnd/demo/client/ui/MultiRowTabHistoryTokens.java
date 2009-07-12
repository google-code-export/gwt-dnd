/*
 * Copyright 2009 Fred Sauer
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.allen_sauer.gwt.dnd.demo.client.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class MultiRowTabHistoryTokens {
  private List<String> list = new ArrayList<String>();
  private HashMap<String, Integer> map = new HashMap<String, Integer>();

  public void add(String historyToken) {
    map.put(historyToken, list.size());
    list.add(historyToken);
  }

  public String getHistoryToken(int i) {
    return list.get(i);
  }

  public Integer getIndex(String historyToken) {
    return map.get(historyToken);
  }
}
