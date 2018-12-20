package com.example.a13306.criminalintent;



/**
 * @author YouChaoMin
 * @date 2018/12/17 23:50.
 * email：1330676845@qq.com
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
public class CrimeFragment extends Fragment {
    private Crime mCrime;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime=new Crime();
    }
}
