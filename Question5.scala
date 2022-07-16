object O1 extends App
{
    def easypace(dist:Int)= dist*8
    def temp(dist:Int)= dist*7

    printf("Total running time: %d min\n", easypace(2)+temp(3)+easypace(2));
}