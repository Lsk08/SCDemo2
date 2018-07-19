package com.kuma.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import javax.sound.midi.SoundbankResource;

/**
 * Created by yuan on 2018/7/18.
 */
public class RxJavaDemo {

    public static void main(String[] args) {
        Observable<Integer> observable=Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> observableEmitter) throws Exception {
                observableEmitter.onNext(1);
                observableEmitter.onNext(2);
                observableEmitter.onNext(3);
//                observableEmitter.onComplete();  onError 和 onComplete只能有一个
                observableEmitter.onError(new Exception("test-exception"));
            }
        });

        Observer<Integer> observer=new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                System.out.println("subscribe:"+disposable.toString());
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("onNext+"+integer);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError:+"+throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete!");
            }
        };

        observable.subscribe(observer);
    }
}
