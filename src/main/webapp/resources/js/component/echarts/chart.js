(function() {
	'use strict';
	define('chart', ['jquery', 'echarts'], function($, echarts) {
		//可标记的柱形图
		function barPoint(option){
			var legendData = option.legendData,
				xData = option.xData,
				seriesName = option.seriesName,
				barWidth = option.barWidth,
				seriesData = option.seriesData,
				chartWrapperId = option.chartWrapperId,
				markPointData = [{type : 'max', name: '最大值',itemStyle: {normal: {color:'#3398DB'}}},
				                 {type : 'min', name: '最小值',itemStyle: {normal: {color:'#3398DB'}}}];
			var chart = echarts.init(document.getElementById(chartWrapperId)),
				option = {
			    tooltip: {
			        trigger: 'axis',
			        axisPointer:{
			        	lineStyle:{
			        		color: '#eee'
			        	}
			        }
			    },
			    color:['#C23531'],
			    legend: {
			        data:legendData,
			        textStyle:{
			            color:'#777777'
			        }
			    },
			    toolbox: {
			        show : true,
			        feature : {
			            dataView : {show: true, readOnly: false},
			            magicType : {show: true, type: ['line', 'bar']},
			            restore : {show: true},
			            saveAsImage : {show: true}
			        }
			    },
			    xAxis: {
			    	axisTick:{
			    		show:false,
			    	},
			        axisLine:{
			            lineStyle:{
			                color:'#777777'
			            }
			        },
			        axisLabel: {
			            textStyle: {
			                color: '#777777',
			                fontSize:16
			            },
			            interval:0//设定标签全部显示
			        },
			        data: xData,
			    },
			    yAxis: {
			        axisLine:{
			            lineStyle:{//修改线条颜色
			                color:'#777777'
			            }
			        },
			        type: 'value'
			    },
			    series: [
			        {
			            name:seriesName,
			            type:'bar',
			            barWidth: barWidth,
			            itemStyle: {
		            		normal: {
		            			barBorderRadius: [5,5,0,0],
		            		}
			            },
			            markPoint : {
			                data : markPointData
			            },
			            markLine : {
			                data : [
			                    {type : 'average', name: '平均值'}
			                ]
			            },
			            data:seriesData
			        }
			    ]
			};
			chart.setOption(option);
		}
		
		//特殊饼图
		function common(option){
			var text = option.text,
				legendData = option.legendData,
				seriesData = option.seriesData;
			var chartWrapperId = option.chartWrapperId,
			chart = echarts.init(document.getElementById(chartWrapperId)),
			option = {
			    title: {
			        text: text,
			        x: 'center',
			        y: 'center',
			        textStyle: {
			            fontWeight: 'normal',
			            fontSize: 14,
			            color: '#000'
			        }
			    },
			    legend: {
			        data: legendData,
			        textStyle:{
						color: '#000',
						fontSize:14
					}
			    },
			    tooltip: {
			        show: true,
			        trigger: 'item',
			        formatter: "{b}: <br /> {c} ({d}%)"
			    },
			    series: [{
			        type: 'pie',
			        selectedMode: 'single',
			        radius: ['35%', '68%'],
			        color: ['#86D560', '#AF89D6', '#59ADF3', '#FF999A', '#FFCC67'],
			        label: {
			            normal: {
			                position: 'inner',
			                formatter: '{b}',
			                textStyle: {
			                    color: '#000',
			                    fontWeight: 'bold',
			                    fontSize: 14
			                }
			            }
			        },
			        labelLine: {
			            normal: {
			                show: false
			            }
			        },
			        data: seriesData
			    }, {
			        type: 'pie',
			        radius: ['63%', '89%'],
			        itemStyle: {
			            normal: {
			                color: '#F2F2F2'
			            },
			            emphasis: {
			                color: '#ADADAD'
			            }
			        },
			        label: {
			            normal: {
			                position: 'inner',
			                formatter: '{d}%',
			                textStyle: {
			                    color: '#777777',
			                    fontWeight: 'bold',
			                    fontSize: 14
			                }
			            }
			        },
			        data: seriesData
			    }]
			};
			chart.setOption(option);
		}
		
		return {
			common: common ,  //特殊饼
			barPoint: barPoint	//标记柱形图
		};
	});
})();
