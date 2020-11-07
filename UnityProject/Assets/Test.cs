
using UnityEngine;
using UnityEngine.UI;

public class Test : MonoBehaviour
{
    public Button btn;
    AndroidJavaObject jo;
    private void Awake()
    {
        AndroidJavaClass jc = new AndroidJavaClass("com.unity3d.player.UnityPlayer");
        jo = jc.GetStatic<AndroidJavaObject>("currentActivity");
        btn.onClick.AddListener(CallAndroid);
    }
    public void CallAndroid()
    {
        jo.Call("ShowToast");
        Debug.Log("点击按钮");
        System.Console.WriteLine("点击按钮");
    }

    void fromAndroid(string str)
    {
        Debug.Log("安卓传来信息 : " + str);
        System.Console.WriteLine("安卓传来信息 : " + str);
    }
}
