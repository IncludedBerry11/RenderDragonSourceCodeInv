#include <bgfx_compute.sh>

uniform vec4 ClearValue;
uniform vec4 VolumeNearFar;
uniform vec4 VolumeDimensions;

IMAGE2D_ARRAY_RO_AUTOREG(s_ScatteringBufferIn,  rgba16f);
IMAGE2D_ARRAY_WR_AUTOREG(s_ScatteringBufferOut, rgba16f);


#if SCATTERING
    #include "Scattering.sc"
#elif CLEAR
    #include "Clear.sc"
#endif
