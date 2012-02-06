/*
 * Copyright © 2010, 2011, 2012 Talis Systems Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.talis.hbase.rdf.layout;

import com.hp.hpl.jena.graph.Node;

public interface TupleLoaderBasics 
{
	public void createTables( Node... row ) throws Exception ;
	
	public void loadTuple( Node... row ) throws Exception ;
	
	public void unloadTuple( Node... row ) throws Exception ;
	
	public void commit() throws Exception ;
}