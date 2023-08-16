package kashyap.anurag.webrtc
import android.webkit.JavascriptInterface

class JavascriptInterface(val callActivity: CallAcitvity) {

    @JavascriptInterface
    public fun onPeerConnected() {
        callActivity.onPeerConnected()
    }

}