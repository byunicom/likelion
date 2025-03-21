    // 샘플 ROW 데이타 정의, DB Select의 1줄 Row들의 모임 list가 될거시당
    const rowData = [
//        { name: "민지", birth: "2004-05-07", nationality: "대한민국" },
//        { name: "하니", birth: "2004-10-06", nationality: "호주|베트남" },
//        { name: "다니엘", birth: "2005-04-11", nationality: "호주|한국" },
//        { name: "해린", birth: "2006-05-15", nationality: "대한민국" },
//        { name: "혜인", birth: "2008-04-21", nationality: "대한민국" }

        {"name": "태한경", "alias": "숨겨진 고민", "strong": "다 이해됨", "weak": "근거가 없음"},
        {"name": "공석규", "alias": "보면 다 이해", "strong": "담배피며 여유찾기", "weak": "찾을 여유가 없음"},
        {"name": "노해건", "alias": "수학의 달인", "strong": "수학잘함", "weak": "산수못함"},
        {"name": "뢰슬우", "alias": "허리 사선", "strong": "눈에 안띔", "weak": "존재가 안보임"},
        {"name": "태래은", "alias": "일단 직진", "strong": "의외로 귀여움", "weak": "외모는 전혀 안 귀여움"},
        {"name": "옥화정", "alias": "경로당 느낌?", "strong": "나이로 대우받기", "weak": "신체나이는?"},
        {"name": "도중희", "alias": "외모는 진지", "strong": "눈빛은 남자", "weak": "말투는 여성여성"},
        {"name": "구산아", "alias": "알람 그게 뭐얌", "strong": "계속 잠", "weak": "깨워도 잠"},
        {"name": "좌하주", "alias": "부끄부끄 초딩", "strong": "챙겨주고 싶음", "weak": "맛집을 모름"},
        {"name": "나승회", "alias": "나름욜씨미 ", "strong": "친한척하기", "weak": "안 친하고 픔"},
        {"name": "은진온", "alias": "멋짱이", "strong": "파란차색깔", "weak": "본인은 안 푸름"},
        {"name": "창승해", "alias": "깨달은자", "strong": "남의 실수 잘 찾기", "weak": "본인 실수는 못 찾음"},
        {"name": "곡루이스", "alias": "배탈", "strong": "넘 열심", "weak": "취미 없음"},
        {"name": "상현덕", "alias": "오마이걸", "strong": "유아 좋아함", "weak": "본인 나이는 어쩔"},
        {"name": "교근찬", "alias": "술쎄보임", "strong": "좋은마우스", "weak": "힘없음"},
        {"name": "연건한", "alias": "그저 웃지요", "strong": "답변은 웃음으로", "weak": "입이 할일이 없음"},
        {"name": "홍길동", "alias": "전공자", "strong": "서류상 전공자", "weak": "서류빼면 비전공자"},
        {"name": "김방구", "alias": "엄마", "strong": "노력 산더미", "weak": "결과는 티끌"},
        {"name": "김채현", "alias": "비밀의 숲", "strong": "잘 감춤", "weak": "보여주면서 감춤"}

    ];

    // 통합 설정 객체, 아주 많은 속성들이 제공됨(일단 몇개만)
    const gridOptions = {
        rowData: rowData,
        columnDefs: [                            // 컬럼 정의
            { field: "name", headerName: "이름" },
            { field: "alias", headerName: "별명" },
            { field: "strong", headerName: "장점" },
            { field: "weak", headerName: "단점" }
        ],
        autoSizeStrategy: {                    // 자동사이즈정책
            type: 'fitGridWidth',              // 그리드넓이기준으로
            defaultMinWidth: 150               // 컬럼 최소사이즈
        },
        rowHeight: 45,                          // row 높이지정
        defaultColDef: {
            sortable:true,
            filter:true,
            resizable:true,
            minWidth:100,
            cellStyle: {
                display: 'flex',
                alignItems: 'center'
            }
        },
        pagination: true,
        paginationPageSizeSeletor: [5, 10, 20],
        paginationPageSize: 15,
        onCellClicked: params => {
            console.log('cell was clicked', params);
        }
    };

    const gridDiv = document.querySelector('#myGrid');
    //  new agGrid.Grid(gridDiv, gridOptions);  // deprecated
    const gridApi = agGrid.createGrid(gridDiv, gridOptions);