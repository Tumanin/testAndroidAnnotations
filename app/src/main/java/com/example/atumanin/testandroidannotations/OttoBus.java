
package com.example.atumanin.testandroidannotations;

import android.util.Log;

import com.squareup.otto.Bus;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EBean.Scope;
import org.androidannotations.annotations.UiThread;

/**
 * Event bus manager.
 */
@EBean(scope = Scope.Singleton)
public class OttoBus extends Bus{

}
