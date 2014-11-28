 /*
  * Copyright (C) 2014 Project D.I.S.C.O.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *      http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
 
 package com.android.settings.disco;

import android.content.ContentResolver;
import android.content.Context;
import android.preference.CheckBoxPreference;
import android.provider.Settings;
import android.provider.Settings.System;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class RecentsShowHideSearchBar {

        final CheckBox recentsShowHideSearchBarCheckBox =
                (CheckBox) view.findViewById(R.id.recents_showhide_searchbar);


        if (System.getInt(getContext().getContentResolver(),
                System.RECENTS_SHOW_HIDE_SEARCH_BAR, 0) == 1) {
            recentsShowHideSearchBarCheckBox.setChecked(true);
        } else {
            recentsShowHideSearchBarCheckBox.setChecked(false);
        }

        recentsShowHideSearchBarCheckBox.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Settings.System.putInt(buttonView.getContext().getContentResolver(),
                        Settings.System.RECENTS_SHOW_HIDE_SEARCH_BAR, isChecked ? 1 : 0);
            }

        });

}
