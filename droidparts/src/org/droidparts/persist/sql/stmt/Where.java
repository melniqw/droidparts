/**
 * Copyright 2013 Alex Yanchenko
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
 */
package org.droidparts.persist.sql.stmt;

import android.util.Pair;

public class Where {

	// TODO

	Where and(Where where) {
		return this;
	}

	Where or(Where where) {
		return this;
	}

	protected Where andWhere(String columnName, Is operator,
			Object... columnValue) {
		return this;
	}

	protected Where orWhere(String columnName, Is operator,
			Object... columnValue) {
		return this;
	}

	Pair<String, Object[]> build() {
		String selection = null;
		Object[] selectionArgs = new Object[0];
		return Pair.create(selection, selectionArgs);
	}
}
