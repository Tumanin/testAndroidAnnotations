
package com.example.atumanin.testandroidannotations;

import android.database.Observable;
import android.util.Log;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EBean.Scope;
import org.androidannotations.annotations.UiThread;

/**
 * Event bus manager.
 */
@EBean(scope = Scope.Singleton)
public class rxBus{

    private PublishSubject<Object> bus = PublishSubject.create();

    public void send(Object o) {
        bus.onNext(o);
    }

    public Observable<Object> toObserverable() {
        return bus;
    }

    public boolean hasObservers() {
        return bus.hasObservers();
    }
}
