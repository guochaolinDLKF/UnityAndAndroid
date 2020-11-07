package com.Wish.UnityProject;

import android.content.Intent;
import android.os.Bundle;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class UnityActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        testSendMessage();
    }
    // 向unity发送信息
    public void testSendMessage()
    {
        //第一个参数是Unity中一个节点对象的名字，第二个参数是节点对象上挂的脚本中一个函数的名字，第三个参数是函数中的参数值
        UnityPlayer.UnitySendMessage("unityObject", "fromAndroid", "test");
    }
    // 接收unity信息
    public void ShowToast()
    {
        // unity点击按钮跳转回安卓界面
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
