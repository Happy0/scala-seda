Scala-SEDA
==========

A version of the "staged event-driven architecture" implemented using scala. A SEDA architecture is intended to support massive concurrency while giving a simple construction for the application.

It is modified in various aspects to fit with the scala ideology. The main unit of concurrency for scala-SEDA are actors. This is in contrast to the thread-based model used in original SEDA. Resource allocators allocate aditional actors instead of allocating aditional threads. The actors that comprise a single stage are controlled via the akka router mechinism to handle load-balancing to the actors.

Users define stages and define how those stages are connected. The user also defines policies for each stage that define when a new actor should be allocated to the stage and when actors can be released.
