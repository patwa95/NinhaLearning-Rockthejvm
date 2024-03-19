import com.sun.org.slf4j.internal.LoggerFactory

import java.time.LocalDateTime
import org.slf4j.LoggerFactory
import com.typesafe.scalalogging.LazyLoggig

val nemo= Array("nemo")
val my_logger = LoggerFactory.getLogger(getClass.getSimpleName)

def function0(arr:Array[String]) ={
    val t0 = LocalDateTime.now()
    for (i<- 0 until arr.length){
        //if(arr(i).contains("nemo"))
        if (arr(i)=="nemo")
            println(" Found NEMO!")
        println(i)
    }
    val t1 = LocalDateTime.now()
    //logger.info(" an")
}

function0(nemo)