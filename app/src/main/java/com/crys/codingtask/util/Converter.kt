package com.crys.codingtask.util

import com.crys.codingtask.data.model.Rates
import com.crys.codingtask.model.CurrencyRecyclerViewItem
import kotlin.math.roundToInt


object Converter {

    val popularCurrency = mutableListOf<CurrencyRecyclerViewItem.Currency>()

    fun ratesToListOfCurrency(rates: Rates, date: String) : List<CurrencyRecyclerViewItem> {
        val list = mutableListOf<CurrencyRecyclerViewItem>()
        //only date
        list.add(CurrencyRecyclerViewItem.Date(date))
        //rest
        if (rates.aED != null) list.add(CurrencyRecyclerViewItem.Currency("aED", rates.aED, date))
        if (rates.aFN != null) list.add(CurrencyRecyclerViewItem.Currency("aFN", rates.aFN, date))
        if (rates.aLL != null) list.add(CurrencyRecyclerViewItem.Currency("aLL", rates.aLL, date))
        if (rates.aMD != null) list.add(CurrencyRecyclerViewItem.Currency("aMD", rates.aMD, date))
        if (rates.aNG != null) list.add(CurrencyRecyclerViewItem.Currency("aNG", rates.aNG, date))
        if (rates.aOA != null) list.add(CurrencyRecyclerViewItem.Currency("aOA", rates.aOA, date))
        if (rates.aRS != null) list.add(CurrencyRecyclerViewItem.Currency("aRS", rates.aRS, date))
        if (rates.aUD != null) list.add(CurrencyRecyclerViewItem.Currency("aUD", rates.aUD, date))
        if (rates.aWG != null) list.add(CurrencyRecyclerViewItem.Currency("aWG", rates.aWG, date))
        if (rates.aZN != null) list.add(CurrencyRecyclerViewItem.Currency("aZN", rates.aZN, date))
        if (rates.bAM != null) list.add(CurrencyRecyclerViewItem.Currency("bAM", rates.bAM, date))
        if (rates.bBD != null) list.add(CurrencyRecyclerViewItem.Currency("bBD", rates.bBD, date))
        if (rates.bDT != null) list.add(CurrencyRecyclerViewItem.Currency("bDT", rates.bDT, date))
        if (rates.bGN != null) list.add(CurrencyRecyclerViewItem.Currency("bGN", rates.bGN, date))
        if (rates.bHD != null) list.add(CurrencyRecyclerViewItem.Currency("bHD", rates.bHD, date))
        if (rates.bIF != null) list.add(CurrencyRecyclerViewItem.Currency("bIF", rates.bIF, date))
        if (rates.bMD != null) list.add(CurrencyRecyclerViewItem.Currency("bMD", rates.bMD, date))
        if (rates.bND != null) list.add(CurrencyRecyclerViewItem.Currency("bND", rates.bND, date))
        if (rates.bOB != null) list.add(CurrencyRecyclerViewItem.Currency("bOB", rates.bOB, date))
        if (rates.bRL != null) list.add(CurrencyRecyclerViewItem.Currency("bRL", rates.bRL, date))
        if (rates.bSD != null) list.add(CurrencyRecyclerViewItem.Currency("bSD", rates.bSD, date))
        if (rates.bTC != null) list.add(CurrencyRecyclerViewItem.Currency("bTC", rates.bTC, date))
        if (rates.bTN != null) list.add(CurrencyRecyclerViewItem.Currency("bTN", rates.bTN, date))
        if (rates.bWP != null) list.add(CurrencyRecyclerViewItem.Currency("bWP", rates.bWP, date))
        if (rates.bYN != null) list.add(CurrencyRecyclerViewItem.Currency("bYN", rates.bYN, date))
        if (rates.bYR != null) list.add(CurrencyRecyclerViewItem.Currency("bYR", rates.bYR, date))
        if (rates.bZD != null) list.add(CurrencyRecyclerViewItem.Currency("bZD", rates.bZD, date))
        if (rates.cAD != null) list.add(CurrencyRecyclerViewItem.Currency("cAD", rates.cAD, date))
        if (rates.cDF != null) list.add(CurrencyRecyclerViewItem.Currency("cDF", rates.cDF, date))
        if (rates.cHF != null) list.add(CurrencyRecyclerViewItem.Currency("cHF", rates.cHF, date))
        if (rates.cLF != null) list.add(CurrencyRecyclerViewItem.Currency("cLF", rates.cLF, date))
        if (rates.cLP != null) list.add(CurrencyRecyclerViewItem.Currency("cLP", rates.cLP, date))
        if (rates.cNY != null) {
            list.add(CurrencyRecyclerViewItem.Currency("cNY", rates.cNY, date))
            popularCurrency.add(CurrencyRecyclerViewItem.Currency("cNY", rates.cNY, date))
        }
        if (rates.cOP != null) list.add(CurrencyRecyclerViewItem.Currency("cOP", rates.cOP, date))
        if (rates.cRC != null) list.add(CurrencyRecyclerViewItem.Currency("cRC", rates.cRC, date))
        if (rates.cUC != null) list.add(CurrencyRecyclerViewItem.Currency("cUC", rates.cUC, date))
        if (rates.cUP != null) list.add(CurrencyRecyclerViewItem.Currency("cUP", rates.cUP, date))
        if (rates.cVE != null) list.add(CurrencyRecyclerViewItem.Currency("cVE", rates.cVE, date))
        if (rates.cZK != null) list.add(CurrencyRecyclerViewItem.Currency("cZK", rates.cZK, date))
        if (rates.dJF != null) list.add(CurrencyRecyclerViewItem.Currency("dJF", rates.dJF, date))
        if (rates.dKK != null) list.add(CurrencyRecyclerViewItem.Currency("dKK", rates.dKK, date))
        if (rates.dOP != null) list.add(CurrencyRecyclerViewItem.Currency("dOP", rates.dOP, date))
        if (rates.dZD != null) list.add(CurrencyRecyclerViewItem.Currency("dZD", rates.dZD, date))
        if (rates.eGP != null) list.add(CurrencyRecyclerViewItem.Currency("eGP", rates.eGP, date))
        if (rates.eRN != null) list.add(CurrencyRecyclerViewItem.Currency("eRN", rates.eRN, date))
        if (rates.eTB != null) list.add(CurrencyRecyclerViewItem.Currency("eTB", rates.eTB, date))
        if (rates.eUR != null) {
            list.add(CurrencyRecyclerViewItem.Currency("eUR", rates.eUR.toDouble(), date))
            popularCurrency.add(CurrencyRecyclerViewItem.Currency("eUR", rates.eUR.toDouble(), date))
        }
        if (rates.fJD != null) list.add(CurrencyRecyclerViewItem.Currency("fJD", rates.fJD, date))
        if (rates.fKP != null) list.add(CurrencyRecyclerViewItem.Currency("fKP", rates.fKP, date))
        if (rates.gBP != null) list.add(CurrencyRecyclerViewItem.Currency("gBP", rates.gBP, date))
        if (rates.gEL != null) list.add(CurrencyRecyclerViewItem.Currency("gEL", rates.gEL, date))
        if (rates.gGP != null) list.add(CurrencyRecyclerViewItem.Currency("gGP", rates.gGP, date))
        if (rates.gHS != null) list.add(CurrencyRecyclerViewItem.Currency("gHS", rates.gHS, date))
        if (rates.gIP != null) list.add(CurrencyRecyclerViewItem.Currency("gIP", rates.gIP, date))
        if (rates.gMD != null) list.add(CurrencyRecyclerViewItem.Currency("gMD", rates.gMD, date))
        if (rates.gNF != null) list.add(CurrencyRecyclerViewItem.Currency("gNF", rates.gNF, date))
        if (rates.gTQ != null) list.add(CurrencyRecyclerViewItem.Currency("gTQ", rates.gTQ, date))
        if (rates.gYD != null) list.add(CurrencyRecyclerViewItem.Currency("gYD", rates.gYD, date))
        if (rates.hKD != null) list.add(CurrencyRecyclerViewItem.Currency("hKD", rates.hKD, date))
        if (rates.hNL != null) list.add(CurrencyRecyclerViewItem.Currency("hNL", rates.hNL, date))
        if (rates.hRK != null) list.add(CurrencyRecyclerViewItem.Currency("hRK", rates.hRK, date))
        if (rates.hTG != null) list.add(CurrencyRecyclerViewItem.Currency("hTG", rates.hTG, date))
        if (rates.hUF != null) list.add(CurrencyRecyclerViewItem.Currency("hUF", rates.hUF, date))
        if (rates.iDR != null) list.add(CurrencyRecyclerViewItem.Currency("iDR", rates.iDR, date))
        if (rates.iLS != null) list.add(CurrencyRecyclerViewItem.Currency("iLS", rates.iLS, date))
        if (rates.iMP != null) list.add(CurrencyRecyclerViewItem.Currency("iMP", rates.iMP, date))
        if (rates.iNR != null) list.add(CurrencyRecyclerViewItem.Currency("iNR", rates.iNR, date))
        if (rates.iQD != null) list.add(CurrencyRecyclerViewItem.Currency("iQD", rates.iQD, date))
        if (rates.iRR != null) list.add(CurrencyRecyclerViewItem.Currency("iRR", rates.iRR, date))
        if (rates.iSK != null) list.add(CurrencyRecyclerViewItem.Currency("iSK", rates.iSK, date))
        if (rates.jEP != null) list.add(CurrencyRecyclerViewItem.Currency("jEP", rates.jEP, date))
        if (rates.jMD != null) list.add(CurrencyRecyclerViewItem.Currency("jMD", rates.jMD, date))
        if (rates.jOD != null) list.add(CurrencyRecyclerViewItem.Currency("jOD", rates.jOD, date))
        if (rates.jPY != null) list.add(CurrencyRecyclerViewItem.Currency("jPY", rates.jPY, date))
        if (rates.kES != null) list.add(CurrencyRecyclerViewItem.Currency("kES", rates.kES, date))
        if (rates.kGS != null) list.add(CurrencyRecyclerViewItem.Currency("kGS", rates.kGS, date))
        if (rates.kHR != null) list.add(CurrencyRecyclerViewItem.Currency("kHR", rates.kHR, date))
        if (rates.kMF != null) list.add(CurrencyRecyclerViewItem.Currency("kMF", rates.kMF, date))
        if (rates.kPW != null) list.add(CurrencyRecyclerViewItem.Currency("kPW", rates.kPW, date))
        if (rates.kRW != null) list.add(CurrencyRecyclerViewItem.Currency("kRW", rates.kRW, date))
        if (rates.kWD != null) list.add(CurrencyRecyclerViewItem.Currency("kWD", rates.kWD, date))
        if (rates.kYD != null) list.add(CurrencyRecyclerViewItem.Currency("kYD", rates.kYD, date))
        if (rates.kZT != null) list.add(CurrencyRecyclerViewItem.Currency("kZT", rates.kZT, date))
        if (rates.lAK != null) list.add(CurrencyRecyclerViewItem.Currency("lAK", rates.lAK, date))
        if (rates.lBP != null) list.add(CurrencyRecyclerViewItem.Currency("lBP", rates.lBP, date))
        if (rates.lKR != null) list.add(CurrencyRecyclerViewItem.Currency("lKR", rates.lKR, date))
        if (rates.lRD != null) list.add(CurrencyRecyclerViewItem.Currency("lRD", rates.lRD, date))
        if (rates.lSL != null) list.add(CurrencyRecyclerViewItem.Currency("lSL", rates.lSL, date))
        if (rates.lTL != null) list.add(CurrencyRecyclerViewItem.Currency("lTL", rates.lTL, date))
        if (rates.lVL != null) list.add(CurrencyRecyclerViewItem.Currency("lVL", rates.lVL, date))
        if (rates.lYD != null) list.add(CurrencyRecyclerViewItem.Currency("lYD", rates.lYD, date))
        if (rates.mAD != null) list.add(CurrencyRecyclerViewItem.Currency("mAD", rates.mAD, date))
        if (rates.mDL != null) list.add(CurrencyRecyclerViewItem.Currency("mDL", rates.mDL, date))
        if (rates.mGA != null) list.add(CurrencyRecyclerViewItem.Currency("mGA", rates.mGA, date))
        if (rates.mKD != null) list.add(CurrencyRecyclerViewItem.Currency("mKD", rates.mKD, date))
        if (rates.mMK != null) list.add(CurrencyRecyclerViewItem.Currency("mMK", rates.mMK, date))
        if (rates.mNT != null) list.add(CurrencyRecyclerViewItem.Currency("mNT", rates.mNT, date))
        if (rates.mOP != null) list.add(CurrencyRecyclerViewItem.Currency("mOP", rates.mOP, date))
        if (rates.mRO != null) list.add(CurrencyRecyclerViewItem.Currency("mRO", rates.mRO, date))
        if (rates.mUR != null) list.add(CurrencyRecyclerViewItem.Currency("mUR", rates.mUR, date))
        if (rates.mVR != null) list.add(CurrencyRecyclerViewItem.Currency("mVR", rates.mVR, date))
        if (rates.mWK != null) list.add(CurrencyRecyclerViewItem.Currency("mWK", rates.mWK, date))
        if (rates.mXN != null) list.add(CurrencyRecyclerViewItem.Currency("mXN", rates.mXN, date))
        if (rates.mYR != null) list.add(CurrencyRecyclerViewItem.Currency("mYR", rates.mYR, date))
        if (rates.mZN != null) list.add(CurrencyRecyclerViewItem.Currency("mZN", rates.mZN, date))
        if (rates.nAD != null) list.add(CurrencyRecyclerViewItem.Currency("nAD", rates.nAD, date))
        if (rates.nGN != null) list.add(CurrencyRecyclerViewItem.Currency("nGN", rates.nGN, date))
        if (rates.nIO != null) list.add(CurrencyRecyclerViewItem.Currency("nIO", rates.nIO, date))
        if (rates.nOK != null) list.add(CurrencyRecyclerViewItem.Currency("nOK", rates.nOK, date))
        if (rates.nPR != null) list.add(CurrencyRecyclerViewItem.Currency("nPR", rates.nPR, date))
        if (rates.nZD != null) list.add(CurrencyRecyclerViewItem.Currency("nZD", rates.nZD, date))
        if (rates.oMR != null) list.add(CurrencyRecyclerViewItem.Currency("oMR", rates.oMR, date))
        if (rates.pAB != null) list.add(CurrencyRecyclerViewItem.Currency("pAB", rates.pAB, date))
        if (rates.pEN != null) list.add(CurrencyRecyclerViewItem.Currency("pEN", rates.pEN, date))
        if (rates.pGK != null) list.add(CurrencyRecyclerViewItem.Currency("pGK", rates.pGK, date))
        if (rates.pHP != null) list.add(CurrencyRecyclerViewItem.Currency("pHP", rates.pHP, date))
        if (rates.pKR != null) list.add(CurrencyRecyclerViewItem.Currency("pKR", rates.pKR, date))
        if (rates.pLN != null) {
            list.add(CurrencyRecyclerViewItem.Currency("pLN", rates.pLN, date))
            popularCurrency.add(CurrencyRecyclerViewItem.Currency("pLN", rates.pLN, date))
        }
        if (rates.pYG != null) list.add(CurrencyRecyclerViewItem.Currency("pYG", rates.pYG, date))
        if (rates.qAR != null) list.add(CurrencyRecyclerViewItem.Currency("qAR", rates.qAR, date))
        if (rates.rON != null) list.add(CurrencyRecyclerViewItem.Currency("rON", rates.rON, date))
        if (rates.rSD != null) list.add(CurrencyRecyclerViewItem.Currency("rSD", rates.rSD, date))
        if (rates.rUB != null) list.add(CurrencyRecyclerViewItem.Currency("rUB", rates.rUB, date))
        if (rates.rWF != null) list.add(CurrencyRecyclerViewItem.Currency("rWF", rates.rWF, date))
        if (rates.sAR != null) list.add(CurrencyRecyclerViewItem.Currency("sAR", rates.sAR, date))
        if (rates.sBD != null) list.add(CurrencyRecyclerViewItem.Currency("sBD", rates.sBD, date))
        if (rates.sCR != null) list.add(CurrencyRecyclerViewItem.Currency("sCR", rates.sCR, date))
        if (rates.sDG != null) list.add(CurrencyRecyclerViewItem.Currency("sDG", rates.sDG, date))
        if (rates.sEK != null) list.add(CurrencyRecyclerViewItem.Currency("sEK", rates.sEK, date))
        if (rates.sGD != null) list.add(CurrencyRecyclerViewItem.Currency("sGD", rates.sGD, date))
        if (rates.sHP != null) list.add(CurrencyRecyclerViewItem.Currency("sHP", rates.sHP, date))
        if (rates.sLL != null) list.add(CurrencyRecyclerViewItem.Currency("sLL", rates.sLL, date))
        if (rates.sOS != null) list.add(CurrencyRecyclerViewItem.Currency("sOS", rates.sOS, date))
        if (rates.sRD != null) list.add(CurrencyRecyclerViewItem.Currency("sRD", rates.sRD, date))
        if (rates.sTD != null) list.add(CurrencyRecyclerViewItem.Currency("sTD", rates.sTD, date))
        if (rates.sVC != null) list.add(CurrencyRecyclerViewItem.Currency("sVC", rates.sVC, date))
        if (rates.sYP != null) list.add(CurrencyRecyclerViewItem.Currency("sYP", rates.sYP, date))
        if (rates.sZL != null) list.add(CurrencyRecyclerViewItem.Currency("sZL", rates.sZL, date))
        if (rates.tHB != null) list.add(CurrencyRecyclerViewItem.Currency("tHB", rates.tHB, date))
        if (rates.tJS != null) list.add(CurrencyRecyclerViewItem.Currency("tJS", rates.tJS, date))
        if (rates.tMT != null) list.add(CurrencyRecyclerViewItem.Currency("tMT", rates.tMT, date))
        if (rates.tND != null) list.add(CurrencyRecyclerViewItem.Currency("tND", rates.tND, date))
        if (rates.tOP != null) list.add(CurrencyRecyclerViewItem.Currency("tOP", rates.tOP, date))
        if (rates.tRY != null) list.add(CurrencyRecyclerViewItem.Currency("tRY", rates.tRY, date))
        if (rates.tTD != null) list.add(CurrencyRecyclerViewItem.Currency("tTD", rates.tTD, date))
        if (rates.tWD != null) list.add(CurrencyRecyclerViewItem.Currency("tWD", rates.tWD, date))
        if (rates.tZS != null) list.add(CurrencyRecyclerViewItem.Currency("tZS", rates.tZS, date))
        if (rates.uAH != null) list.add(CurrencyRecyclerViewItem.Currency("uAH", rates.uAH, date))
        if (rates.uGX != null) list.add(CurrencyRecyclerViewItem.Currency("uGX", rates.uGX, date))
        if (rates.uSD != null) {
            list.add(CurrencyRecyclerViewItem.Currency("uSD", rates.uSD, date))
            popularCurrency.add(CurrencyRecyclerViewItem.Currency("uSD", rates.uSD, date))
        }
        if (rates.uYU != null) list.add(CurrencyRecyclerViewItem.Currency("uYU", rates.uYU, date))
        if (rates.uZS != null) list.add(CurrencyRecyclerViewItem.Currency("uZS", rates.uZS, date))
        if (rates.vEF != null) list.add(CurrencyRecyclerViewItem.Currency("vEF", rates.vEF, date))
        if (rates.vND != null) list.add(CurrencyRecyclerViewItem.Currency("vND", rates.vND, date))
        if (rates.vUV != null) list.add(CurrencyRecyclerViewItem.Currency("vUV", rates.vUV, date))
        if (rates.wST != null) list.add(CurrencyRecyclerViewItem.Currency("wST", rates.wST, date))
        if (rates.xAF != null) list.add(CurrencyRecyclerViewItem.Currency("xAF", rates.xAF, date))
        if (rates.xAG != null) list.add(CurrencyRecyclerViewItem.Currency("xAG", rates.xAG, date))
        if (rates.xAU != null) list.add(CurrencyRecyclerViewItem.Currency("xAU", rates.xAU, date))
        if (rates.xCD != null) list.add(CurrencyRecyclerViewItem.Currency("xCD", rates.xCD, date))
        if (rates.xDR != null) list.add(CurrencyRecyclerViewItem.Currency("xDR", rates.xDR, date))
        if (rates.xOF != null) list.add(CurrencyRecyclerViewItem.Currency("xOF", rates.xOF, date))
        if (rates.xPF != null) list.add(CurrencyRecyclerViewItem.Currency("xPF", rates.xPF, date))
        if (rates.yER != null) list.add(CurrencyRecyclerViewItem.Currency("yER", rates.yER, date))
        if (rates.zAR != null) list.add(CurrencyRecyclerViewItem.Currency("zAR", rates.zAR, date))
        if (rates.zMK != null) list.add(CurrencyRecyclerViewItem.Currency("zMK", rates.zMK, date))
        if (rates.zMW != null) list.add(CurrencyRecyclerViewItem.Currency("zMW", rates.zMW, date))
        if (rates.zWL != null) list.add(CurrencyRecyclerViewItem.Currency("zWL", rates.zWL, date))

        return list
    }
    //round double to 5 digits
    fun roundCurrency(number: Double) : Double {
        return (number * 100000.0).roundToInt() / 100000.0
    }

    //we convert 2021-01-01 to 01 january 2021
    fun stringToDate(date: String, monthsArray: Array<String>) : String {
        //if length is valid and format
        return if (date.length == 10 && date[4] == '-' && date[7] == '-') {
            try {
                val month = date.subSequence(5, 7).toString().toInt()
                if (monthsArray.size > month) {
                    "${date.subSequence(8, 10)} ${monthsArray[month - 1]} ${
                        date.subSequence(0, 4)}"
                } else {
                    date
                }

            } catch (e: Exception) {
                date
            }
        } else {
            date
        }
    }
}