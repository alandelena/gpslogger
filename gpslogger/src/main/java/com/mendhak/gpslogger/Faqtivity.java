/*
*    This file is part of GPSLogger for Android.
*
*    GPSLogger for Android is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 3 of the License, or
*    (at your option) any later version.
*
*    GPSLogger for Android is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with GPSLogger for Android.  If not, see <http://www.gnu.org/licenses/>.
*/


package com.mendhak.gpslogger;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import org.slf4j.LoggerFactory;

public class Faqtivity extends Activity
{


    private static final org.slf4j.Logger tracer = LoggerFactory.getLogger(Faqtivity.class.getSimpleName());
    /**
     * Event raised when the form is created for the first time
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        tracer.debug("Faqtivity.onCreate");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_faq);

        WebView browser = (WebView)findViewById(R.id.faqwebview);
        WebSettings settings = browser.getSettings();
        settings.setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/faq.html");
    }




}
