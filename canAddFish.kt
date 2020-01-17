

fun canAddFish(tankSize:Int,currentFish:List<Int>,fishSize:Int = 2,hasDecorations:Boolean=true):Boolean{
    if(hasDecorations){
        var tankSize1 :Int = tankSize - 2
        var total :Int = 0
        for(i in 1..currentFish.size){
            total = total + currentFish[i]
        }
        total = total + fishSize
        if(tankSize1<total){
            return false
        }
    }else{
        var total = fishSize
        for(i in 1..currentFish.size){
            total = total + currentFish[i]
        }
        if(tankSize<total){
            return false
        }
    }
    return true
}