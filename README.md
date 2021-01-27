# LEGaTO Project OmpSs and DFiant Integration
This repository holds an example of [OmpSs@FPGA](https://pm.bsc.es/ompss-at-fpga) and [DFiant](https://dfianthdl.github.io/) integration for the LEGaTO EU Horizon 2020 project.

# Prerequisites 

* You are required to have a Xilinx Zedboard.

* OmpSs @ FPGA Installation. Follow instructions of its [user-guide](https://pm.bsc.es/ftp/ompss-at-fpga/doc/user-guide/).

* Scala Tools Installation via Coursier. Follow instruction of its [user-guide](https://alexarchambault.github.io/posts/2020-09-21-cs-setup.html).

* For Simulation: Install either GHDL or Modelsim. 

* Locally clone this repo via: 

`git clone https://github.com/DFiantHDL/ompss_integration.git`

# Simulating DFiant Code

Run `sbt compile "runMain Sim"` in either `loopback` or `matmul` demo folders (also supported running: `make dfiantSim`). 

# Building and Running

The makefile is already modified to integrate the DFiant kernel as part of the bitstream build.

1. Run `make` in either `loopback` or `matmul` demo folders. A new Vivado project will be created to that relies on existing Vivado HLS and OmpSs integration.  

2. Stream the bitstream into your FPGA and run OmpSs on the Zync. The program should run with no errors.

