package com.qunar.fresh.jvm.understanding.jvm;

/**
 * @version 1.0.0 @author junhua.han @date 2017-10-29 @time 下午9:35 <br>
 *
 * 此代码演示了两点：
 * 1. 对象可以在被gc时自我拯救。
 * 2. 这种自救的机会只有一次，因为一个对象的finalize方法最多只会被系统自动调用一次
 */
public class FinallizeEscapeGC {
    public static FinallizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yes, i am still alive");
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed !");
        FinallizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinallizeEscapeGC();

        //第一次，自我拯救
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);

        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no, i am dead :(");
        }

        //第二次，代码与上面完全相同
        SAVE_HOOK = null;
        System.gc();
        Thread.sleep(500);

        if(SAVE_HOOK != null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no, i am dead :(");
        }
    }
}
