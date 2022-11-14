package com.victor.orrillo.apptecbus

class BusRepository(
    val buses : MutableList<Bus> = ArrayList()
) {
    init {
        getDataBuses()
    }

    fun getDataBuses() : List<Bus>{
        buses.add(Bus(1, "AVIACION - J.PRADO - CAMPUS", "bus_tecsup1"));
        buses.add(Bus(2, "PUENTE NUEVO - CAMPUS", "bus_tecsup1"));
        buses.add(Bus(3, "CAMPUS - AV. J.PRADO - AV. LA MARINA - OV. LA PERLA", "bus_tecsup2"));
        buses.add(Bus(4, "CAMPUS - PUENTE NUEVO", "bus_tecsup2"));
        buses.add(Bus(5, "CAMPUS - MEGA PLAZA", "bus_tecsup2"));
        buses.add(Bus(6, "CAMPUS - PTE. PRIMAVERA - PTE. BENAVIDES - PTE ATOCONGO", "bus_tecsup2"));
        buses.add(Bus(7, "CAMPUS - CHACLACAYO", "bus_tecsup2"));

        return buses;
    }
}