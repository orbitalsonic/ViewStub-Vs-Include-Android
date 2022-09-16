package com.orbitalsonic.includevsviewstub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.orbitalsonic.includevsviewstub.databinding.ActivityExampleViewstubBinding
import com.orbitalsonic.includevsviewstub.databinding.MyItems1Binding

class ExampleViewstubActivity : AppCompatActivity() {
    private val binding by lazy { ActivityExampleViewstubBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

       /* binding.viewStub1.inflate()
        binding.viewStub2.inflate()
        binding.viewStub3.inflate()
        binding.viewStub4.inflate()*/

//         withDelay(1000) { binding.viewStub1.inflate() }
         withDelay(3000) { binding.viewStub2.inflate() }
         withDelay(5000) { binding.viewStub3.inflate() }
         withDelay(7000) { binding.viewStub4.inflate() }


//        binding.viewStub3.setOnInflateListener { viewStub, view ->
//            binding.viewStub4.inflate()
//        }
//
//        binding.viewStub2.setOnInflateListener { viewStub, view ->
//            binding.viewStub3.inflate()
//        }
//
//        binding.viewStub1.setOnInflateListener { p0, p1 ->
//            binding.viewStub2.inflate()
//        }
//
//        binding.viewStub1.inflate()

        listeners()

    }

    private fun listeners(){
        val view = binding.viewStub1.inflate()
        view?.let {
            val stubBinding = MyItems1Binding.bind(it)
            stubBinding.item1.setOnClickListener {
                Toast.makeText(this,"Item 1",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun withDelay(delay: Long = 300, block: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed(block, delay)
    }
}