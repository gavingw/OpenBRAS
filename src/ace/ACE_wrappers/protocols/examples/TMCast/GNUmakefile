# -*- makefile -*-
#----------------------------------------------------------------------------
#       GNU ACE Workspace
#
# 
#
# This file was generated by MPC.  Any changes made directly to
# this file will be lost the next time it is generated.
#
# MPC Command:
# /home/johnny/ACE/DOC_ROOT/stage-4623/ACE_wrappers/bin/mwc.pl -type gnuace -exclude TAO/TAO_ACE.mwc -workers 8 -recurse -hierarchy -relative ACE_ROOT=/home/johnny/ACE/DOC_ROOT/stage-4623/ACE_wrappers -relative TAO_ROOT=/home/johnny/ACE/DOC_ROOT/stage-4623/ACE_wrappers/TAO
#
#----------------------------------------------------------------------------

MAKEFILE = GNUmakefile

ifeq ($(findstring k,$(MAKEFLAGS)),k)
  KEEP_GOING = -
endif

include $(ACE_ROOT)/include/makeinclude/macros.GNU

all: Member-target

depend: Member-target-depend

REMAINING_TARGETS := $(filter-out all depend,$(TARGETS_NESTED:.nested=)) $(CUSTOM_TARGETS)

$(REMAINING_TARGETS):
	$(KEEP_GOING)@cd Member && $(MAKE) -f GNUmakefile.Member $(@)

.PHONY: Member-target
Member-target:
	$(KEEP_GOING)@cd Member && $(MAKE) -f GNUmakefile.Member all

.PHONY: Member-target-depend
Member-target-depend:
	$(KEEP_GOING)@cd Member && $(MAKE) -f GNUmakefile.Member depend

project_name_list:
	@echo Member-target
