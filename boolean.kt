fun main() {
    val kamu = 12
    val buka = 9
    val tutup = 17
    val logika = 9 < kamu && kamu < 17
    println("Kantor = $logika")
    //OR
    var _officeOpen = 7
    var _officeClosed = 16
    var _now = 20
    var isClose = _now < _officeOpen || _now > _officeClosed
    print("Office is closed : $isClose")

    //Not
    var officeOpen = 7
    var now = 10
    var isOpen = now > officeOpen

    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

}