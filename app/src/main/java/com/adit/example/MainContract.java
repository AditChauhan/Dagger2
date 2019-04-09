/*
 * Copyright (c) 2019. DEVELOPED BY ADIT CHAUHAN
 */

package com.adit.example;


public interface MainContract {

    interface ViewCallBack {
        void showProgress();

        void hideProgress();

        void setQuote(String string);
    }

    interface ModelCallBack {
        interface OnFinishedListener {
            void onFinished(String string);
        }

        void getNextQuote(OnFinishedListener onFinishedListener);
    }

    interface PresenterCallBack {
        void onButtonClick();

        void onDestroy();
    }
}
