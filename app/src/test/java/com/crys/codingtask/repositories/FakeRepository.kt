package com.crys.codingtask.repositories

import com.crys.codingtask.data.model.LatestResponse
import com.crys.codingtask.data.model.Rates
import com.crys.codingtask.data.model.SelectedDateResponse
import com.crys.codingtask.other.Resource

class FakeRepository : Repository {

    private var shouldReturnNetworkError = false

    override suspend fun getLatestResponse(): Resource<LatestResponse> {
        return if(shouldReturnNetworkError) {
            Resource.error("Error", null)
        } else {
            Resource.success(
                LatestResponse(
                    "EUR",
                    "2021-11-17",
                    Rates(0.2666404367280385, 0.18818962246190463, 0.43215572585481954, 0.1795955281996957, 0.2686401751467027, 0.8935149927996695, 0.3581676245756733, 0.48318340440844054, 0.6423729067299307, 0.5839253772288752, 0.2616058843116199, 0.10241649981844747, 0.49051241284598845, 0.5769581948578829, 0.7666624117309392, 0.6021755769077746, 0.2508049616418202, 0.6332996141041277, 0.32278795555776707, 0.4305413455469683, 0.7664882071436315, 0.3099229417083367, 0.506232322277399, 0.2108371434030637, 0.7677517760714625, 0.7407259555207976, 0.6059329334101536, 0.8223919344494448, 0.2923472225320889, 0.24899440776643345, 0.026253283529467653, 0.3857763995216945, 0.5275547231152072, 0.8766831622255189, 0.008798753130780379, 0.5895547081737949, 0.7910671782372062, 0.1274206491988098, 0.9265143049086988, 0.14813313075932633, 0.8849521720010196, 0.9633058259050744, 0.9354948790176255, 0.5640758214326439, 0.8547056749269756, 0.3699818075562, 1, 0.7832971315773266, 0.2645112096938387, 0.6101334628112705, 0.0682193397643086, 0.7778292652676218, 0.4601710556269881, 0.6224709440910035, 0.7166609849146894, 0.5684023395265726, 0.9327768170824076, 0.8914248598437979, 0.9095647021608108, 0.7078638829896172, 0.819038736466812, 0.5121931122128015, 0.11908865418936332, 0.786503233760382, 0.7782944231443873, 0.10644329147974985, 0.943049060200292, 0.09163560964543027, 0.9715692230894003, 0.7058886087081052, 0.022316518782245054, 0.15633961458281975, 0.634662330455987, 0.7141194813612974, 0.5095285823183329, 0.5660312099819099, 0.7850839130716303, 0.5814869590235155, 0.8208385898254849, 0.056595884403921715, 0.931770181312083, 0.8834980535900675, 0.7471472840477041, 0.6340899724178881, 0.26685526526652925, 0.08009751018335443, 0.1272402896711664, 0.1735614459369833, 0.7103796374480935, 0.35137395265895, 0.19248105310273356, 0.7133290603002905, 0.35166717564496686, 0.5546432238938488, 0.3811854893646758, 0.45109798783216437, 0.2852037033999013, 0.52852509115994, 0.8905314228130208, 0.26957941753898973, 0.5742021628991103, 0.6815438339775695, 0.4848314554688574, 0.4718202214274947, 0.0916406802285773, 0.045947517934227355, 0.11122600916185632, 0.29023805655665325, 0.28641134494645537, 0.7518543869955031, 0.6873284221912823, 0.6483963976050761, 0.5013193510095505, 0.18249911993398016, 0.02008130851477563, 0.600843051953445, 0.3300236382333739, 0.9082657697847117, 0.19105989754463537, 0.8538744596284098, 0.6416113177577522, 0.8653583218253885, 0.9006843764128311, 0.7788776415175381, 0.32435045154963604, 0.14437328002186256, 0.20227990540248653, 0.36994045152128685, 0.5042668155168978, 0.18470404247157246, 0.7766497774200081, 0.668709556815623, 0.9795418070639462, 0.13261932945052146, 0.3988034137414834, 0.2820154029426202, 0.8783305416826237, 0.6140230668511192, 0.530707663297696, 0.7515717540263682, 0.0954506147773676, 0.19731702878648705, 0.03740633719674624, 0.7000966470159827, 0.8924932823952588, 0.3774510105944645, 0.8685795855624758, 0.8744910621317913, 0.15626098095061147, 0.9991603043548052, 0.17359113325350228, 0.43425006773971353, 0.20203595602833424, 0.6555533411676893, 0.7252980710634911, 0.09207070306265963, 0.6810369563270995, 0.747627258219837, 0.716374447256968, 0.0036596432182867122, 0.10552213128009447, 0.5709525658307203, 0.961626395272309, 0.6250331338576517, 0.7403479101815787, 0.007682742236985396, 0.29075305653151384, 0.10814013314029536),
                    true,
                    123412
                )
            )
        }
    }

    override suspend fun getSelectedDateResponse(date: String): Resource<SelectedDateResponse> {
        return if(shouldReturnNetworkError) {
            Resource.error("Error", null)
        } else {
            Resource.success(
                SelectedDateResponse(
                    "EUR",
                    "2012-05-31",
                    true,
                    Rates(0.2666404367280385, 0.18818962246190463, 0.43215572585481954, 0.1795955281996957, 0.2686401751467027, 0.8935149927996695, 0.3581676245756733, 0.48318340440844054, 0.6423729067299307, 0.5839253772288752, 0.2616058843116199, 0.10241649981844747, 0.49051241284598845, 0.5769581948578829, 0.7666624117309392, 0.6021755769077746, 0.2508049616418202, 0.6332996141041277, 0.32278795555776707, 0.4305413455469683, 0.7664882071436315, 0.3099229417083367, 0.506232322277399, 0.2108371434030637, 0.7677517760714625, 0.7407259555207976, 0.6059329334101536, 0.8223919344494448, 0.2923472225320889, 0.24899440776643345, 0.026253283529467653, 0.3857763995216945, 0.5275547231152072, 0.8766831622255189, 0.008798753130780379, 0.5895547081737949, 0.7910671782372062, 0.1274206491988098, 0.9265143049086988, 0.14813313075932633, 0.8849521720010196, 0.9633058259050744, 0.9354948790176255, 0.5640758214326439, 0.8547056749269756, 0.3699818075562, 1, 0.7832971315773266, 0.2645112096938387, 0.6101334628112705, 0.0682193397643086, 0.7778292652676218, 0.4601710556269881, 0.6224709440910035, 0.7166609849146894, 0.5684023395265726, 0.9327768170824076, 0.8914248598437979, 0.9095647021608108, 0.7078638829896172, 0.819038736466812, 0.5121931122128015, 0.11908865418936332, 0.786503233760382, 0.7782944231443873, 0.10644329147974985, 0.943049060200292, 0.09163560964543027, 0.9715692230894003, 0.7058886087081052, 0.022316518782245054, 0.15633961458281975, 0.634662330455987, 0.7141194813612974, 0.5095285823183329, 0.5660312099819099, 0.7850839130716303, 0.5814869590235155, 0.8208385898254849, 0.056595884403921715, 0.931770181312083, 0.8834980535900675, 0.7471472840477041, 0.6340899724178881, 0.26685526526652925, 0.08009751018335443, 0.1272402896711664, 0.1735614459369833, 0.7103796374480935, 0.35137395265895, 0.19248105310273356, 0.7133290603002905, 0.35166717564496686, 0.5546432238938488, 0.3811854893646758, 0.45109798783216437, 0.2852037033999013, 0.52852509115994, 0.8905314228130208, 0.26957941753898973, 0.5742021628991103, 0.6815438339775695, 0.4848314554688574, 0.4718202214274947, 0.0916406802285773, 0.045947517934227355, 0.11122600916185632, 0.29023805655665325, 0.28641134494645537, 0.7518543869955031, 0.6873284221912823, 0.6483963976050761, 0.5013193510095505, 0.18249911993398016, 0.02008130851477563, 0.600843051953445, 0.3300236382333739, 0.9082657697847117, 0.19105989754463537, 0.8538744596284098, 0.6416113177577522, 0.8653583218253885, 0.9006843764128311, 0.7788776415175381, 0.32435045154963604, 0.14437328002186256, 0.20227990540248653, 0.36994045152128685, 0.5042668155168978, 0.18470404247157246, 0.7766497774200081, 0.668709556815623, 0.9795418070639462, 0.13261932945052146, 0.3988034137414834, 0.2820154029426202, 0.8783305416826237, 0.6140230668511192, 0.530707663297696, 0.7515717540263682, 0.0954506147773676, 0.19731702878648705, 0.03740633719674624, 0.7000966470159827, 0.8924932823952588, 0.3774510105944645, 0.8685795855624758, 0.8744910621317913, 0.15626098095061147, 0.9991603043548052, 0.17359113325350228, 0.43425006773971353, 0.20203595602833424, 0.6555533411676893, 0.7252980710634911, 0.09207070306265963, 0.6810369563270995, 0.747627258219837, 0.716374447256968, 0.0036596432182867122, 0.10552213128009447, 0.5709525658307203, 0.961626395272309, 0.6250331338576517, 0.7403479101815787, 0.007682742236985396, 0.29075305653151384, 0.10814013314029536),
                    true,
                    123412
                )
            )
        }
    }
}