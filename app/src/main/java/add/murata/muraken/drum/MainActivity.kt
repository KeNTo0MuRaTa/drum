package add.murata.muraken.drum

import android.media.AudioAttributes
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mSoundPool: SoundPool

    private lateinit var mSoundID : Array<Int?>

    private val mSoundResource = arrayOf(
        R.raw.cymbal1,
        R.raw.cymbal2,
        R.raw.cymbal3,
        R.raw.tom1,
        R.raw.tom2,
        R.raw.tom3,
        R.raw.hihat,
        R.raw.snare,
        R.raw.bass
    )

    override fun onResume() {
        super.onResume()

        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()

        mSoundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(mSoundResource.size)
            .build()

        mSoundID = arrayOfNulls(mSoundResource.size)

        for(i in 0..(mSoundResource.size - 1)){
            mSoundID[i] = mSoundPool.load(applicationContext,mSoundResource[i],0)
        }

        fun onDestroy() {
            super.onDestroy()

            mSoundPool.release()
        }

        imageButton.setOnClickListener(){
            if(mSoundID[0] != null){
                mSoundPool.play(mSoundID[0] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
        imageButton4.setOnClickListener(){
            if(mSoundID[1] != null){
                mSoundPool.play(mSoundID[1] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
        imageButton9.setOnClickListener(){
            if(mSoundID[2] != null){
                mSoundPool.play(mSoundID[2] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
        imageButton2.setOnClickListener(){
            if(mSoundID[3] != null){
                mSoundPool.play(mSoundID[3] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
        imageButton3.setOnClickListener(){
            if(mSoundID[4] != null){
                mSoundPool.play(mSoundID[4] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
        imageButton8.setOnClickListener(){
            if(mSoundID[5] != null){
                mSoundPool.play(mSoundID[5] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
        imageButton5.setOnClickListener(){
            if(mSoundID[6] != null){
                mSoundPool.play(mSoundID[6] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
        imageButton6.setOnClickListener(){
            if(mSoundID[7] != null){
                mSoundPool.play(mSoundID[7] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
        imageButton7.setOnClickListener(){
            if(mSoundID[8] != null){
                mSoundPool.play(mSoundID[8] as Int,1.0F,1.0F,0,0,1.0F)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}