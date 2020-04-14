# LEGaTO Project OmpSs and DFiant Integration
This repository holds an example of [OmpSs@FPGA](https://pm.bsc.es/ompss-at-fpga) and [DFiant](https://dfianthdl.github.io/) integration for the LEGaTO EU Horizon 2020 project.

# Prerequisites 

* You are required to have a Xilinx Zedboard.

* OmpSs @ FPGA Installation. Follow instructions of its [user-guide](https://pm.bsc.es/ftp/ompss-at-fpga/doc/user-guide/).

* Scala Build Tool (SBT) Installation. Follow instruction of its [user-guide](https://www.scala-sbt.org/1.x/docs/Getting-Started.html).

* Locally clone this repo via: 

`git clone https://github.com/DFiantHDL/ompss_integration.git`


# Building and Running

1. Run `make` under the `ompss_loopback` folder. A new Vivado project will be created to that relies on existing Vivado HLS and OmpSs integration.  

2. Run `sbt run` under the `dfiant_loopback` folder. The dfiant project will generate an alternative `loopback_moved.vhdl` to be used as replacement for the one generated in the OmpSs build process.

3. Replace the `loopback_moved.vhdl` inside the Vivado project (as a VHDL 2008 file) and rebuild the project to generate an updated bitstream file.

4. Stream the bitstream into your FPGA and run OmpSs on the Zync. The program should run with no errors.

(for the final integration we will attempt to automate these steps)