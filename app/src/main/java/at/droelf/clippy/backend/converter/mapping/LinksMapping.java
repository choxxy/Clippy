package at.droelf.clippy.backend.converter.mapping;


import at.droelf.clippy.R;

public class LinksMapping implements AgentMapping{

    private final int numberColumns = 24;
    private final int numberRows = 31;

    private final static int[] SOUND_MAPPING = {
            R.raw.links_snd_01,
            R.raw.links_snd_02,
            R.raw.links_snd_03,
            R.raw.links_snd_04,
            R.raw.links_snd_05,
            R.raw.links_snd_06,
            R.raw.links_snd_07,
            R.raw.links_snd_08,
            R.raw.links_snd_09,
            R.raw.links_snd_10,
            R.raw.links_snd_11,
            R.raw.links_snd_12,
            R.raw.links_snd_13,
            R.raw.links_snd_14,
            R.raw.links_snd_15,
            R.raw.links_snd_16,
            R.raw.links_snd_17,
            R.raw.links_snd_18,
            R.raw.links_snd_19,
            R.raw.links_snd_20,
            R.raw.links_snd_21
    };

    private final static int[] IMAGE_MAPPING = {
            R.drawable.links_0000,
            R.drawable.links_0001,
            R.drawable.links_0002,
            R.drawable.links_0003,
            R.drawable.links_0004,
            R.drawable.links_0005,
            R.drawable.links_0006,
            R.drawable.links_0007,
            R.drawable.links_0008,
            R.drawable.links_0009,
            R.drawable.links_0010,
            R.drawable.links_0011,
            R.drawable.links_0012,
            R.drawable.links_0013,
            R.drawable.links_0014,
            R.drawable.links_0015,
            R.drawable.links_0016,
            R.drawable.links_0017,
            R.drawable.links_0018,
            R.drawable.links_0019,
            R.drawable.links_0020,
            R.drawable.links_0021,
            R.drawable.links_0022,
            R.drawable.links_0023,
            R.drawable.links_0024,
            R.drawable.links_0025,
            R.drawable.links_0026,
            R.drawable.links_0027,
            R.drawable.links_0028,
            R.drawable.links_0029,
            R.drawable.links_0030,
            R.drawable.links_0031,
            R.drawable.links_0032,
            R.drawable.links_0033,
            R.drawable.links_0034,
            R.drawable.links_0035,
            R.drawable.links_0036,
            R.drawable.links_0037,
            R.drawable.links_0038,
            R.drawable.links_0039,
            R.drawable.links_0040,
            R.drawable.links_0041,
            R.drawable.links_0042,
            R.drawable.links_0043,
            R.drawable.links_0044,
            R.drawable.links_0045,
            R.drawable.links_0046,
            R.drawable.links_0047,
            R.drawable.links_0048,
            R.drawable.links_0049,
            R.drawable.links_0050,
            R.drawable.links_0051,
            R.drawable.links_0052,
            R.drawable.links_0053,
            R.drawable.links_0054,
            R.drawable.links_0055,
            R.drawable.links_0056,
            R.drawable.links_0057,
            R.drawable.links_0058,
            R.drawable.links_0059,
            R.drawable.links_0060,
            R.drawable.links_0061,
            R.drawable.links_0062,
            R.drawable.links_0063,
            R.drawable.links_0064,
            R.drawable.links_0065,
            R.drawable.links_0066,
            R.drawable.links_0067,
            R.drawable.links_0068,
            R.drawable.links_0069,
            R.drawable.links_0070,
            R.drawable.links_0071,
            R.drawable.links_0072,
            R.drawable.links_0073,
            R.drawable.links_0074,
            R.drawable.links_0075,
            R.drawable.links_0076,
            R.drawable.links_0077,
            R.drawable.links_0078,
            R.drawable.links_0079,
            R.drawable.links_0080,
            R.drawable.links_0081,
            R.drawable.links_0082,
            R.drawable.links_0083,
            R.drawable.links_0084,
            R.drawable.links_0085,
            R.drawable.links_0086,
            R.drawable.links_0087,
            R.drawable.links_0088,
            R.drawable.links_0089,
            R.drawable.links_0090,
            R.drawable.links_0091,
            R.drawable.links_0092,
            R.drawable.links_0093,
            R.drawable.links_0094,
            R.drawable.links_0095,
            R.drawable.links_0096,
            R.drawable.links_0097,
            R.drawable.links_0098,
            R.drawable.links_0099,
            R.drawable.links_0100,
            R.drawable.links_0101,
            R.drawable.links_0102,
            R.drawable.links_0103,
            R.drawable.links_0104,
            R.drawable.links_0105,
            R.drawable.links_0106,
            R.drawable.links_0107,
            R.drawable.links_0108,
            R.drawable.links_0109,
            R.drawable.links_0110,
            R.drawable.links_0111,
            R.drawable.links_0112,
            R.drawable.links_0113,
            R.drawable.links_0114,
            R.drawable.links_0115,
            R.drawable.links_0116,
            R.drawable.links_0117,
            R.drawable.links_0118,
            R.drawable.links_0119,
            R.drawable.links_0120,
            R.drawable.links_0121,
            R.drawable.links_0122,
            R.drawable.links_0123,
            R.drawable.links_0124,
            R.drawable.links_0125,
            R.drawable.links_0126,
            R.drawable.links_0127,
            R.drawable.links_0128,
            R.drawable.links_0129,
            R.drawable.links_0130,
            R.drawable.links_0131,
            R.drawable.links_0132,
            R.drawable.links_0133,
            R.drawable.links_0134,
            R.drawable.links_0135,
            R.drawable.links_0136,
            R.drawable.links_0137,
            R.drawable.links_0138,
            R.drawable.links_0139,
            R.drawable.links_0140,
            R.drawable.links_0141,
            R.drawable.links_0142,
            R.drawable.links_0143,
            R.drawable.links_0144,
            R.drawable.links_0145,
            R.drawable.links_0146,
            R.drawable.links_0147,
            R.drawable.links_0148,
            R.drawable.links_0149,
            R.drawable.links_0150,
            R.drawable.links_0151,
            R.drawable.links_0152,
            R.drawable.links_0153,
            R.drawable.links_0154,
            R.drawable.links_0155,
            R.drawable.links_0156,
            R.drawable.links_0157,
            R.drawable.links_0158,
            R.drawable.links_0159,
            R.drawable.links_0160,
            R.drawable.links_0161,
            R.drawable.links_0162,
            R.drawable.links_0163,
            R.drawable.links_0164,
            R.drawable.links_0165,
            R.drawable.links_0166,
            R.drawable.links_0167,
            R.drawable.links_0168,
            R.drawable.links_0169,
            R.drawable.links_0170,
            R.drawable.links_0171,
            R.drawable.links_0172,
            R.drawable.links_0173,
            R.drawable.links_0174,
            R.drawable.links_0175,
            R.drawable.links_0176,
            R.drawable.links_0177,
            R.drawable.links_0178,
            R.drawable.links_0179,
            R.drawable.links_0180,
            R.drawable.links_0181,
            R.drawable.links_0182,
            R.drawable.links_0183,
            R.drawable.links_0184,
            R.drawable.links_0185,
            R.drawable.links_0186,
            R.drawable.links_0187,
            R.drawable.links_0188,
            R.drawable.links_0189,
            R.drawable.links_0190,
            R.drawable.links_0191,
            R.drawable.links_0192,
            R.drawable.links_0193,
            R.drawable.links_0194,
            R.drawable.links_0195,
            R.drawable.links_0196,
            R.drawable.links_0197,
            R.drawable.links_0198,
            R.drawable.links_0199,
            R.drawable.links_0200,
            R.drawable.links_0201,
            R.drawable.links_0202,
            R.drawable.links_0203,
            R.drawable.links_0204,
            R.drawable.links_0205,
            R.drawable.links_0206,
            R.drawable.links_0207,
            R.drawable.links_0208,
            R.drawable.links_0209,
            R.drawable.links_0210,
            R.drawable.links_0211,
            R.drawable.links_0212,
            R.drawable.links_0213,
            R.drawable.links_0214,
            R.drawable.links_0215,
            R.drawable.links_0216,
            R.drawable.links_0217,
            R.drawable.links_0218,
            R.drawable.links_0219,
            R.drawable.links_0220,
            R.drawable.links_0221,
            R.drawable.links_0222,
            R.drawable.links_0223,
            R.drawable.links_0224,
            R.drawable.links_0225,
            R.drawable.links_0226,
            R.drawable.links_0227,
            R.drawable.links_0228,
            R.drawable.links_0229,
            R.drawable.links_0230,
            R.drawable.links_0231,
            R.drawable.links_0232,
            R.drawable.links_0233,
            R.drawable.links_0234,
            R.drawable.links_0235,
            R.drawable.links_0236,
            R.drawable.links_0237,
            R.drawable.links_0238,
            R.drawable.links_0239,
            R.drawable.links_0240,
            R.drawable.links_0241,
            R.drawable.links_0242,
            R.drawable.links_0243,
            R.drawable.links_0244,
            R.drawable.links_0245,
            R.drawable.links_0246,
            R.drawable.links_0247,
            R.drawable.links_0248,
            R.drawable.links_0249,
            R.drawable.links_0250,
            R.drawable.links_0251,
            R.drawable.links_0252,
            R.drawable.links_0253,
            R.drawable.links_0254,
            R.drawable.links_0255,
            R.drawable.links_0256,
            R.drawable.links_0257,
            R.drawable.links_0258,
            R.drawable.links_0259,
            R.drawable.links_0260,
            R.drawable.links_0261,
            R.drawable.links_0262,
            R.drawable.links_0263,
            R.drawable.links_0264,
            R.drawable.links_0265,
            R.drawable.links_0266,
            R.drawable.links_0267,
            R.drawable.links_0268,
            R.drawable.links_0269,
            R.drawable.links_0270,
            R.drawable.links_0271,
            R.drawable.links_0272,
            R.drawable.links_0273,
            R.drawable.links_0274,
            R.drawable.links_0275,
            R.drawable.links_0276,
            R.drawable.links_0277,
            R.drawable.links_0278,
            R.drawable.links_0279,
            R.drawable.links_0280,
            R.drawable.links_0281,
            R.drawable.links_0282,
            R.drawable.links_0283,
            R.drawable.links_0284,
            R.drawable.links_0285,
            R.drawable.links_0286,
            R.drawable.links_0287,
            R.drawable.links_0288,
            R.drawable.links_0289,
            R.drawable.links_0290,
            R.drawable.links_0291,
            R.drawable.links_0292,
            R.drawable.links_0293,
            R.drawable.links_0294,
            R.drawable.links_0295,
            R.drawable.links_0296,
            R.drawable.links_0297,
            R.drawable.links_0298,
            R.drawable.links_0299,
            R.drawable.links_0300,
            R.drawable.links_0301,
            R.drawable.links_0302,
            R.drawable.links_0303,
            R.drawable.links_0304,
            R.drawable.links_0305,
            R.drawable.links_0306,
            R.drawable.links_0307,
            R.drawable.links_0308,
            R.drawable.links_0309,
            R.drawable.links_0310,
            R.drawable.links_0311,
            R.drawable.links_0312,
            R.drawable.links_0313,
            R.drawable.links_0314,
            R.drawable.links_0315,
            R.drawable.links_0316,
            R.drawable.links_0317,
            R.drawable.links_0318,
            R.drawable.links_0319,
            R.drawable.links_0320,
            R.drawable.links_0321,
            R.drawable.links_0322,
            R.drawable.links_0323,
            R.drawable.links_0324,
            R.drawable.links_0325,
            R.drawable.links_0326,
            R.drawable.links_0327,
            R.drawable.links_0328,
            R.drawable.links_0329,
            R.drawable.links_0330,
            R.drawable.links_0331,
            R.drawable.links_0332,
            R.drawable.links_0333,
            R.drawable.links_0334,
            R.drawable.links_0335,
            R.drawable.links_0336,
            R.drawable.links_0337,
            R.drawable.links_0338,
            R.drawable.links_0339,
            R.drawable.links_0340,
            R.drawable.links_0341,
            R.drawable.links_0342,
            R.drawable.links_0343,
            R.drawable.links_0344,
            R.drawable.links_0345,
            R.drawable.links_0346,
            R.drawable.links_0347,
            R.drawable.links_0348,
            R.drawable.links_0349,
            R.drawable.links_0350,
            R.drawable.links_0351,
            R.drawable.links_0352,
            R.drawable.links_0353,
            R.drawable.links_0354,
            R.drawable.links_0355,
            R.drawable.links_0356,
            R.drawable.links_0357,
            R.drawable.links_0358,
            R.drawable.links_0359,
            R.drawable.links_0360,
            R.drawable.links_0361,
            R.drawable.links_0362,
            R.drawable.links_0363,
            R.drawable.links_0364,
            R.drawable.links_0365,
            R.drawable.links_0366,
            R.drawable.links_0367,
            R.drawable.links_0368,
            R.drawable.links_0369,
            R.drawable.links_0370,
            R.drawable.links_0371,
            R.drawable.links_0372,
            R.drawable.links_0373,
            R.drawable.links_0374,
            R.drawable.links_0375,
            R.drawable.links_0376,
            R.drawable.links_0377,
            R.drawable.links_0378,
            R.drawable.links_0379,
            R.drawable.links_0380,
            R.drawable.links_0381,
            R.drawable.links_0382,
            R.drawable.links_0383,
            R.drawable.links_0384,
            R.drawable.links_0385,
            R.drawable.links_0386,
            R.drawable.links_0387,
            R.drawable.links_0388,
            R.drawable.links_0389,
            R.drawable.links_0390,
            R.drawable.links_0391,
            R.drawable.links_0392,
            R.drawable.links_0393,
            R.drawable.links_0394,
            R.drawable.links_0395,
            R.drawable.links_0396,
            R.drawable.links_0397,
            R.drawable.links_0398,
            R.drawable.links_0399,
            R.drawable.links_0400,
            R.drawable.links_0401,
            R.drawable.links_0402,
            R.drawable.links_0403,
            R.drawable.links_0404,
            R.drawable.links_0405,
            R.drawable.links_0406,
            R.drawable.links_0407,
            R.drawable.links_0408,
            R.drawable.links_0409,
            R.drawable.links_0410,
            R.drawable.links_0411,
            R.drawable.links_0412,
            R.drawable.links_0413,
            R.drawable.links_0414,
            R.drawable.links_0415,
            R.drawable.links_0416,
            R.drawable.links_0417,
            R.drawable.links_0418,
            R.drawable.links_0419,
            R.drawable.links_0420,
            R.drawable.links_0421,
            R.drawable.links_0422,
            R.drawable.links_0423,
            R.drawable.links_0424,
            R.drawable.links_0425,
            R.drawable.links_0426,
            R.drawable.links_0427,
            R.drawable.links_0428,
            R.drawable.links_0429,
            R.drawable.links_0430,
            R.drawable.links_0431,
            R.drawable.links_0432,
            R.drawable.links_0433,
            R.drawable.links_0434,
            R.drawable.links_0435,
            R.drawable.links_0436,
            R.drawable.links_0437,
            R.drawable.links_0438,
            R.drawable.links_0439,
            R.drawable.links_0440,
            R.drawable.links_0441,
            R.drawable.links_0442,
            R.drawable.links_0443,
            R.drawable.links_0444,
            R.drawable.links_0445,
            R.drawable.links_0446,
            R.drawable.links_0447,
            R.drawable.links_0448,
            R.drawable.links_0449,
            R.drawable.links_0450,
            R.drawable.links_0451,
            R.drawable.links_0452,
            R.drawable.links_0453,
            R.drawable.links_0454,
            R.drawable.links_0455,
            R.drawable.links_0456,
            R.drawable.links_0457,
            R.drawable.links_0458,
            R.drawable.links_0459,
            R.drawable.links_0460,
            R.drawable.links_0461,
            R.drawable.links_0462,
            R.drawable.links_0463,
            R.drawable.links_0464,
            R.drawable.links_0465,
            R.drawable.links_0466,
            R.drawable.links_0467,
            R.drawable.links_0468,
            R.drawable.links_0469,
            R.drawable.links_0470,
            R.drawable.links_0471,
            R.drawable.links_0472,
            R.drawable.links_0473,
            R.drawable.links_0474,
            R.drawable.links_0475,
            R.drawable.links_0476,
            R.drawable.links_0477,
            R.drawable.links_0478,
            R.drawable.links_0479,
            R.drawable.links_0480,
            R.drawable.links_0481,
            R.drawable.links_0482,
            R.drawable.links_0483,
            R.drawable.links_0484,
            R.drawable.links_0485,
            R.drawable.links_0486,
            R.drawable.links_0487,
            R.drawable.links_0488,
            R.drawable.links_0489,
            R.drawable.links_0490,
            R.drawable.links_0491,
            R.drawable.links_0492,
            R.drawable.links_0493,
            R.drawable.links_0494,
            R.drawable.links_0495,
            R.drawable.links_0496,
            R.drawable.links_0497,
            R.drawable.links_0498,
            R.drawable.links_0499,
            R.drawable.links_0500,
            R.drawable.links_0501,
            R.drawable.links_0502,
            R.drawable.links_0503,
            R.drawable.links_0504,
            R.drawable.links_0505,
            R.drawable.links_0506,
            R.drawable.links_0507,
            R.drawable.links_0508,
            R.drawable.links_0509,
            R.drawable.links_0510,
            R.drawable.links_0511,
            R.drawable.links_0512,
            R.drawable.links_0513,
            R.drawable.links_0514,
            R.drawable.links_0515,
            R.drawable.links_0516,
            R.drawable.links_0517,
            R.drawable.links_0518,
            R.drawable.links_0519,
            R.drawable.links_0520,
            R.drawable.links_0521,
            R.drawable.links_0522,
            R.drawable.links_0523,
            R.drawable.links_0524,
            R.drawable.links_0525,
            R.drawable.links_0526,
            R.drawable.links_0527,
            R.drawable.links_0528,
            R.drawable.links_0529,
            R.drawable.links_0530,
            R.drawable.links_0531,
            R.drawable.links_0532,
            R.drawable.links_0533,
            R.drawable.links_0534,
            R.drawable.links_0535,
            R.drawable.links_0536,
            R.drawable.links_0537,
            R.drawable.links_0538,
            R.drawable.links_0539,
            R.drawable.links_0540,
            R.drawable.links_0541,
            R.drawable.links_0542,
            R.drawable.links_0543,
            R.drawable.links_0544,
            R.drawable.links_0545,
            R.drawable.links_0546,
            R.drawable.links_0547,
            R.drawable.links_0548,
            R.drawable.links_0549,
            R.drawable.links_0550,
            R.drawable.links_0551,
            R.drawable.links_0552,
            R.drawable.links_0553,
            R.drawable.links_0554,
            R.drawable.links_0555,
            R.drawable.links_0556,
            R.drawable.links_0557,
            R.drawable.links_0558,
            R.drawable.links_0559,
            R.drawable.links_0560,
            R.drawable.links_0561,
            R.drawable.links_0562,
            R.drawable.links_0563,
            R.drawable.links_0564,
            R.drawable.links_0565,
            R.drawable.links_0566,
            R.drawable.links_0567,
            R.drawable.links_0568,
            R.drawable.links_0569,
            R.drawable.links_0570,
            R.drawable.links_0571,
            R.drawable.links_0572,
            R.drawable.links_0573,
            R.drawable.links_0574,
            R.drawable.links_0575,
            R.drawable.links_0576,
            R.drawable.links_0577,
            R.drawable.links_0578,
            R.drawable.links_0579,
            R.drawable.links_0580,
            R.drawable.links_0581,
            R.drawable.links_0582,
            R.drawable.links_0583,
            R.drawable.links_0584,
            R.drawable.links_0585,
            R.drawable.links_0586,
            R.drawable.links_0587,
            R.drawable.links_0588,
            R.drawable.links_0589,
            R.drawable.links_0590,
            R.drawable.links_0591,
            R.drawable.links_0592,
            R.drawable.links_0593,
            R.drawable.links_0594,
            R.drawable.links_0595,
            R.drawable.links_0596,
            R.drawable.links_0597,
            R.drawable.links_0598,
            R.drawable.links_0599,
            R.drawable.links_0600,
            R.drawable.links_0601,
            R.drawable.links_0602,
            R.drawable.links_0603,
            R.drawable.links_0604,
            R.drawable.links_0605,
            R.drawable.links_0606,
            R.drawable.links_0607,
            R.drawable.links_0608,
            R.drawable.links_0609,
            R.drawable.links_0610,
            R.drawable.links_0611,
            R.drawable.links_0612,
            R.drawable.links_0613,
            R.drawable.links_0614,
            R.drawable.links_0615,
            R.drawable.links_0616,
            R.drawable.links_0617,
            R.drawable.links_0618,
            R.drawable.links_0619,
            R.drawable.links_0620,
            R.drawable.links_0621,
            R.drawable.links_0622,
            R.drawable.links_0623,
            R.drawable.links_0624,
            R.drawable.links_0625,
            R.drawable.links_0626,
            R.drawable.links_0627,
            R.drawable.links_0628,
            R.drawable.links_0629,
            R.drawable.links_0630,
            R.drawable.links_0631,
            R.drawable.links_0632,
            R.drawable.links_0633,
            R.drawable.links_0634,
            R.drawable.links_0635,
            R.drawable.links_0636,
            R.drawable.links_0637,
            R.drawable.links_0638,
            R.drawable.links_0639,
            R.drawable.links_0640,
            R.drawable.links_0641,
            R.drawable.links_0642,
            R.drawable.links_0643,
            R.drawable.links_0644,
            R.drawable.links_0645,
            R.drawable.links_0646,
            R.drawable.links_0647,
            R.drawable.links_0648,
            R.drawable.links_0649,
            R.drawable.links_0650,
            R.drawable.links_0651,
            R.drawable.links_0652,
            R.drawable.links_0653,
            R.drawable.links_0654,
            R.drawable.links_0655,
            R.drawable.links_0656,
            R.drawable.links_0657,
            R.drawable.links_0658,
            R.drawable.links_0659,
            R.drawable.links_0660,
            R.drawable.links_0661,
            R.drawable.links_0662,
            R.drawable.links_0663,
            R.drawable.links_0664,
            R.drawable.links_0665,
            R.drawable.links_0666,
            R.drawable.links_0667,
            R.drawable.links_0668,
            R.drawable.links_0669,
            R.drawable.links_0670,
            R.drawable.links_0671,
            R.drawable.links_0672,
            R.drawable.links_0673,
            R.drawable.links_0674,
            R.drawable.links_0675,
            R.drawable.links_0676,
            R.drawable.links_0677,
            R.drawable.links_0678,
            R.drawable.links_0679,
            R.drawable.links_0680,
            R.drawable.links_0681,
            R.drawable.links_0682,
            R.drawable.links_0683,
            R.drawable.links_0684,
            R.drawable.links_0685,
            R.drawable.links_0686,
            R.drawable.links_0687,
            R.drawable.links_0688,
            R.drawable.links_0689,
            R.drawable.links_0690,
            R.drawable.links_0691,
            R.drawable.links_0692,
            R.drawable.links_0693,
            R.drawable.links_0694,
            R.drawable.links_0695,
            R.drawable.links_0696,
            R.drawable.links_0697,
            R.drawable.links_0698,
            R.drawable.links_0699,
            R.drawable.links_0700,
            R.drawable.links_0701,
            R.drawable.links_0702,
            R.drawable.links_0703,
            R.drawable.links_0704,
            R.drawable.links_0705,
            R.drawable.links_0706,
            R.drawable.links_0707,
            R.drawable.links_0708,
            R.drawable.links_0709,
            R.drawable.links_0710,
            R.drawable.links_0711,
            R.drawable.links_0712,
            R.drawable.links_0713,
            R.drawable.links_0714,
            R.drawable.links_0715,
            R.drawable.links_0716,
            R.drawable.links_0717,
            R.drawable.links_0718,
            R.drawable.links_0719,
            R.drawable.links_0720,
            R.drawable.links_0721,
            R.drawable.links_0722,
            R.drawable.links_0723,
            R.drawable.links_0724,
            R.drawable.links_0725,
            R.drawable.links_0726,
            R.drawable.links_0727,
            R.drawable.links_0728,
            R.drawable.links_0729,
            R.drawable.links_0730,
            R.drawable.links_0731,
            R.drawable.links_0732,
            R.drawable.links_0733,
            R.drawable.links_0734,
            R.drawable.links_0735,
            R.drawable.links_0736,
            R.drawable.links_0737,
            R.drawable.links_0738,
            R.drawable.links_0739,
            R.drawable.links_0740,
            R.drawable.links_0741,
            R.drawable.links_0742,
            R.drawable.links_0743
    };

    @Override
    public int[] getMapping() {
        return IMAGE_MAPPING;
    }

    @Override
    public int[] getSOUND_MAPPING() {
        return SOUND_MAPPING;
    }

    @Override
    public int getNumberRows() {
        return numberRows;
    }

    @Override
    public int getNUMBER_COLUMNS() {
        return numberColumns;
    }

    @Override
    public int getEmptyFrameId() {
        return R.drawable.links_0743;
    }

    @Override
    public int getFirstFrameId() {
        return R.drawable.links_0000;
    }
}
