package keeplive.zune.com.keeplivedemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.support.v4.app.JobIntentService

/**
 * Created by leigong2 on 2018-06-16 016.
 */
class BindService: Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        print("zune: 测试bindservice")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        print("zune: 测试bindservice start")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        print("zune: 测试bindservice onDestroy")
    }
}