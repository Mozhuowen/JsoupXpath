package cn.wanghaomiao.xpath.exception;
/*
   Copyright 2014 Wang Haomiao<et.tw@163.com>

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
/**
 * @author: 汪浩淼 [ et.tw@163.com ]
 * Date: 14-3-16
 */
public class NoSuchFunctionException extends Exception {
    public NoSuchFunctionException(String msg){
        super(msg);
    }
}
