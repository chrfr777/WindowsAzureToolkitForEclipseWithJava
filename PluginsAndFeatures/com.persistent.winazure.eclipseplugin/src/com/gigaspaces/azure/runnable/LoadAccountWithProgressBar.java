/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.gigaspaces.azure.runnable;

import org.eclipse.swt.widgets.Shell;

import waeclipseplugin.Activator;
import com.gigaspaces.azure.propertypage.Messages;
import com.gigaspaces.azure.rest.RestAPIException;
import com.gigaspaces.azure.util.PreferenceUtil;
import com.gigaspaces.azure.util.PublishData;

public class LoadAccountWithProgressBar extends AccountActionRunnable {

	public LoadAccountWithProgressBar(PublishData data, Shell shell) {
		super(data, shell);
	}
	

	@Override
	public void doTask() {
		try {
			PreferenceUtil.load(this);
		} catch (RestAPIException e) {
			Activator.getDefault().log(Messages.error, e);
		}
	}
}
